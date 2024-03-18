package Wh;

import id.AbstractC3557B;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes2.dex */
public final class G {

    /* renamed from: a  reason: collision with root package name */
    public final C1656a f21148a;

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f21149b;

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f21150c;

    public G(C1656a c1656a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        AbstractC3557B.c0("address", c1656a);
        AbstractC3557B.c0("socketAddress", inetSocketAddress);
        this.f21148a = c1656a;
        this.f21149b = proxy;
        this.f21150c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof G) {
            G g10 = (G) obj;
            if (AbstractC3557B.K(g10.f21148a, this.f21148a) && AbstractC3557B.K(g10.f21149b, this.f21149b) && AbstractC3557B.K(g10.f21150c, this.f21150c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f21149b.hashCode();
        return this.f21150c.hashCode() + ((hashCode + ((this.f21148a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f21150c + '}';
    }
}
