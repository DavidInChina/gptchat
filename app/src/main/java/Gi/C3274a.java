package gi;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import l8.AbstractC4344b;

/* renamed from: gi.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3274a extends ProxySelector {

    /* renamed from: a  reason: collision with root package name */
    public static final C3274a f31644a = new ProxySelector();

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return AbstractC4344b.F0(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
