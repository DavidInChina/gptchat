package ai;

import K4.C0823k;
import Wh.AbstractC1660e;
import Wh.C1656a;
import Wh.G;
import Wh.s;
import id.AbstractC3557B;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kf.v;
import l8.AbstractC4344b;
import m.C4528h;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final C1656a f24301a;

    /* renamed from: b  reason: collision with root package name */
    public final C0823k f24302b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC1660e f24303c;

    /* renamed from: d  reason: collision with root package name */
    public final Wh.n f24304d;

    /* renamed from: e  reason: collision with root package name */
    public final List f24305e;

    /* renamed from: f  reason: collision with root package name */
    public int f24306f;

    /* renamed from: g  reason: collision with root package name */
    public List f24307g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f24308h = new ArrayList();

    public p(C1656a c1656a, C0823k c0823k, j jVar, Wh.n nVar) {
        List list;
        AbstractC3557B.c0("address", c1656a);
        AbstractC3557B.c0("routeDatabase", c0823k);
        AbstractC3557B.c0("call", jVar);
        AbstractC3557B.c0("eventListener", nVar);
        this.f24301a = c1656a;
        this.f24302b = c0823k;
        this.f24303c = jVar;
        this.f24304d = nVar;
        v vVar = v.f37483Y;
        this.f24305e = vVar;
        this.f24307g = vVar;
        s sVar = c1656a.f21166i;
        AbstractC3557B.c0("url", sVar);
        Proxy proxy = c1656a.f21164g;
        if (proxy != null) {
            list = AbstractC4344b.F0(proxy);
        } else {
            URI h10 = sVar.h();
            if (h10.getHost() == null) {
                list = Xh.b.l(Proxy.NO_PROXY);
            } else {
                List<Proxy> select = c1656a.f21165h.select(h10);
                if (select != null && !select.isEmpty()) {
                    list = Xh.b.x(select);
                } else {
                    list = Xh.b.l(Proxy.NO_PROXY);
                }
            }
        }
        this.f24305e = list;
        this.f24306f = 0;
    }

    public final boolean a() {
        boolean z10;
        if (this.f24306f < this.f24305e.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && !(!this.f24308h.isEmpty())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [m.h, java.lang.Object] */
    public final C4528h b() {
        boolean z10;
        String str;
        int i10;
        boolean contains;
        List<InetAddress> list;
        if (a()) {
            ArrayList arrayList = new ArrayList();
            while (this.f24306f < this.f24305e.size()) {
                if (this.f24306f < this.f24305e.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C1656a c1656a = this.f24301a;
                if (z10) {
                    List list2 = this.f24305e;
                    int i11 = this.f24306f;
                    this.f24306f = i11 + 1;
                    Proxy proxy = (Proxy) list2.get(i11);
                    ArrayList arrayList2 = new ArrayList();
                    this.f24307g = arrayList2;
                    if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
                        SocketAddress address = proxy.address();
                        if (address instanceof InetSocketAddress) {
                            AbstractC3557B.b0("proxyAddress", address);
                            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                            InetAddress address2 = inetSocketAddress.getAddress();
                            if (address2 == null) {
                                str = inetSocketAddress.getHostName();
                                AbstractC3557B.b0("hostName", str);
                            } else {
                                str = address2.getHostAddress();
                                AbstractC3557B.b0("address.hostAddress", str);
                            }
                            i10 = inetSocketAddress.getPort();
                        } else {
                            throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                        }
                    } else {
                        s sVar = c1656a.f21166i;
                        str = sVar.f21253d;
                        i10 = sVar.f21254e;
                    }
                    if (1 <= i10 && i10 < 65536) {
                        if (proxy.type() == Proxy.Type.SOCKS) {
                            arrayList2.add(InetSocketAddress.createUnresolved(str, i10));
                        } else {
                            byte[] bArr = Xh.b.f21996a;
                            AbstractC3557B.c0("<this>", str);
                            if (Xh.b.f22001f.b(str)) {
                                list = AbstractC4344b.F0(InetAddress.getByName(str));
                            } else {
                                this.f24304d.getClass();
                                AbstractC3557B.c0("call", this.f24303c);
                                List a5 = c1656a.f21158a.a(str);
                                if (!a5.isEmpty()) {
                                    list = a5;
                                } else {
                                    throw new UnknownHostException(c1656a.f21158a + " returned no addresses for " + str);
                                }
                            }
                            for (InetAddress inetAddress : list) {
                                arrayList2.add(new InetSocketAddress(inetAddress, i10));
                            }
                        }
                        for (InetSocketAddress inetSocketAddress2 : this.f24307g) {
                            G g10 = new G(this.f24301a, proxy, inetSocketAddress2);
                            C0823k c0823k = this.f24302b;
                            synchronized (c0823k) {
                                contains = c0823k.f9441a.contains(g10);
                            }
                            if (contains) {
                                this.f24308h.add(g10);
                            } else {
                                arrayList.add(g10);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            break;
                        }
                    } else {
                        throw new SocketException("No route to " + str + ':' + i10 + "; port is out of range");
                    }
                } else {
                    throw new SocketException("No route to " + c1656a.f21166i.f21253d + "; exhausted proxy configurations: " + this.f24305e);
                }
            }
            if (arrayList.isEmpty()) {
                kf.s.N1(this.f24308h, arrayList);
                this.f24308h.clear();
            }
            ?? obj = new Object();
            obj.f38770Z = arrayList;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
