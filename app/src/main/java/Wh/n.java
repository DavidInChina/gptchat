package Wh;

import id.AbstractC3557B;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* loaded from: classes2.dex */
public final class n implements AbstractC1657b, l, m {

    /* renamed from: d  reason: collision with root package name */
    public static final n f21234d = new Object();

    @Override // Wh.m
    public List a(String str) {
        AbstractC3557B.c0("hostname", str);
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            AbstractC3557B.b0("getAllByName(hostname)", allByName);
            return kf.q.z3(allByName);
        } catch (NullPointerException e10) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e10);
            throw unknownHostException;
        }
    }
}
