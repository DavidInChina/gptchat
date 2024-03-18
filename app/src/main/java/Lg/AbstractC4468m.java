package lg;

import androidx.glance.appwidget.protobuf.AbstractC2041a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: lg.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4468m extends p {

    /* renamed from: Y  reason: collision with root package name */
    public final C4465j f38403Y;

    public AbstractC4468m() {
        this.f38403Y = new C4465j();
    }

    public final boolean g() {
        int i10 = 0;
        while (true) {
            C4444B c4444b = this.f38403Y.f38397a;
            if (i10 < c4444b.f38339Z.size()) {
                if (!C4465j.e((Map.Entry) c4444b.f38339Z.get(i10))) {
                    return false;
                }
                i10++;
            } else {
                for (Map.Entry entry : c4444b.h()) {
                    if (!C4465j.e(entry)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    public final int h() {
        C4444B c4444b;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            c4444b = this.f38403Y.f38397a;
            if (i10 >= c4444b.f38339Z.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c4444b.f38339Z.get(i10);
            i11 += C4465j.d((C4469n) entry.getKey(), entry.getValue());
            i10++;
        }
        for (Map.Entry entry2 : c4444b.h()) {
            i11 += C4465j.d((C4469n) entry2.getKey(), entry2.getValue());
        }
        return i11;
    }

    public final Object i(C4470o c4470o) {
        n(c4470o);
        C4444B c4444b = this.f38403Y.f38397a;
        C4469n c4469n = c4470o.f38412d;
        Object obj = c4444b.get(c4469n);
        if (obj == null) {
            return c4470o.f38410b;
        }
        if (c4469n.f38407i0) {
            if (c4469n.f38406h0.f38355Y == EnumC4455M.f38364n0) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    arrayList.add(c4470o.a(obj2));
                }
                return arrayList;
            }
            return obj;
        }
        return c4470o.a(obj);
    }

    public final boolean j(C4470o c4470o) {
        n(c4470o);
        C4465j c4465j = this.f38403Y;
        c4465j.getClass();
        C4469n c4469n = c4470o.f38412d;
        if (!c4469n.f38407i0) {
            if (c4465j.f38397a.get(c4469n) != null) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    public final void k() {
        this.f38403Y.f();
    }

    public final B2.E l() {
        return new B2.E(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(C4461f c4461f, C4462g c4462g, C4464i c4464i, int i10) {
        boolean z10;
        boolean z11;
        Object obj;
        AbstractC2041a abstractC2041a;
        AbstractC4456a abstractC4456a;
        AbstractC4456a defaultInstanceForType = getDefaultInstanceForType();
        int i11 = i10 & 7;
        c4464i.getClass();
        C4470o c4470o = (C4470o) c4464i.f38395a.get(new C4463h(i10 >>> 3, defaultInstanceForType));
        if (c4470o != null) {
            C4469n c4469n = c4470o.f38412d;
            EnumC4454L enumC4454L = c4469n.f38406h0;
            C4465j c4465j = C4465j.f38396d;
            if (i11 == enumC4454L.f38356Z) {
                z11 = false;
                z10 = false;
            } else if (c4469n.f38407i0 && enumC4454L.a() && i11 == 2) {
                z11 = false;
                z10 = true;
            }
            if (!z11) {
                return c4461f.q(i10, c4462g);
            }
            C4465j c4465j2 = this.f38403Y;
            if (z10) {
                int d10 = c4461f.d(c4461f.k());
                C4469n c4469n2 = c4470o.f38412d;
                if (c4469n2.f38406h0 == EnumC4454L.ENUM) {
                    while (c4461f.b() > 0) {
                        q mo76a = c4469n2.f38404Y.mo76a(c4461f.k());
                        if (mo76a == null) {
                            return true;
                        }
                        c4465j2.a(c4469n2, c4470o.b(mo76a));
                    }
                } else {
                    while (c4461f.b() > 0) {
                        c4465j2.a(c4469n2, C4465j.h(c4461f, c4469n2.f38406h0));
                    }
                }
                c4461f.c(d10);
                return true;
            }
            int ordinal = c4470o.f38412d.f38406h0.f38355Y.ordinal();
            C4469n c4469n3 = c4470o.f38412d;
            if (ordinal != 7) {
                if (ordinal != 8) {
                    obj = C4465j.h(c4461f, c4469n3.f38406h0);
                } else {
                    if (!c4469n3.f38407i0 && (abstractC4456a = (AbstractC4456a) c4465j2.f38397a.get(c4469n3)) != null) {
                        abstractC2041a = abstractC4456a.c();
                    } else {
                        abstractC2041a = null;
                    }
                    if (abstractC2041a == null) {
                        abstractC2041a = c4470o.f38411c.b();
                    }
                    if (c4469n3.f38406h0 == EnumC4454L.GROUP) {
                        int i12 = c4461f.f38387i;
                        if (i12 < 64) {
                            c4461f.f38387i = i12 + 1;
                            abstractC2041a.b(c4461f, c4464i);
                            c4461f.a((c4469n3.f38405Z << 3) | 4);
                            c4461f.f38387i--;
                        } else {
                            throw new t("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                        }
                    } else {
                        int k10 = c4461f.k();
                        if (c4461f.f38387i < 64) {
                            int d11 = c4461f.d(k10);
                            c4461f.f38387i++;
                            abstractC2041a.b(c4461f, c4464i);
                            c4461f.a(0);
                            c4461f.f38387i--;
                            c4461f.c(d11);
                        } else {
                            throw new t("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                        }
                    }
                    obj = abstractC2041a.a();
                }
            } else {
                int k11 = c4461f.k();
                q mo76a2 = c4469n3.f38404Y.mo76a(k11);
                if (mo76a2 == null) {
                    c4462g.v(i10);
                    c4462g.v(k11);
                    return true;
                }
                obj = mo76a2;
            }
            if (c4469n3.f38407i0) {
                c4465j2.a(c4469n3, c4470o.b(obj));
                return true;
            }
            c4465j2.i(c4469n3, c4470o.b(obj));
            return true;
        }
        z10 = false;
        z11 = true;
        if (!z11) {
        }
    }

    public final void n(C4470o c4470o) {
        if (c4470o.f38409a == getDefaultInstanceForType()) {
            return;
        }
        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }

    public AbstractC4468m(AbstractC4467l abstractC4467l) {
        abstractC4467l.f38401Z.f();
        abstractC4467l.f38402h0 = false;
        this.f38403Y = abstractC4467l.f38401Z;
    }
}
