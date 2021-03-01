package com.jolyoulu.adapter.springmvcadapter;

import com.jolyoulu.adapter.interfaceadpter.Voltage10V;
import com.sun.corba.se.impl.protocol.giopmsgheaders.TargetAddressHelper;
import com.sun.org.apache.bcel.internal.generic.NEW;
import net.sf.cglib.core.MethodWrapper;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: JolyouLu
 * @Date: 2021/2/28 2:04
 * @Version 1.0
 */
public class DispatchServlet {

    public static List<HandlerAdapter> handlerAdapters = new ArrayList<>();

    public DispatchServlet() {
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
        handlerAdapters.add(new AnnotationHandlerAdapter());
    }

    public void doDispatch(){
        //模拟SpringMVC从request取handler对象
        HttpController httpController = new HttpController();
        HandlerAdapter adapter = getHandler(httpController);
        adapter.handler(httpController);
    }

    public HandlerAdapter getHandler(Controller controller){
        for (HandlerAdapter handlerAdapter : handlerAdapters) {
            if (handlerAdapter.supports(controller)){
                return handlerAdapter;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        DispatchServlet dispatchServlet = new DispatchServlet();
        dispatchServlet.doDispatch();
    }
}
