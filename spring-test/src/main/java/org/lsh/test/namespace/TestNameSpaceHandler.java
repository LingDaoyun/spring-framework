package org.lsh.test.namespace;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class TestNameSpaceHandler  extends NamespaceHandlerSupport  {
	@Override
	public void init() {
		System.out.println("调用了自定的NameSpaceHandler");
	}
}
