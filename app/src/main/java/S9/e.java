package S9;

import Lg.n;
import O9.Q;
import aa.C1939b;
import aa.EnumC1938a;
import android.gov.nist.core.Separators;
import ca.C2316h;
import ca.C2317i;
import ca.C2325q;
import ca.EnumC2323o;
import com.openai.experiment.r;
import fa.AbstractC2965B;
import fa.C2969F;
import fa.EnumC2971H;
import ha.M;
import ha.T;
import ha.X;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import jf.C3963m;
import kf.t;
import l8.AbstractC4344b;
import x8.W;

/* loaded from: classes.dex */
public final class e extends N9.f {

    /* renamed from: a  reason: collision with root package name */
    public final C3963m f16409a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f16410b;

    /* renamed from: c  reason: collision with root package name */
    public C1939b f16411c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f16412d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public AbstractC2965B f16413e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C2969F c2969f, r rVar) {
        super(c2969f);
        AbstractC3557B.c0("message", c2969f);
        AbstractC3557B.c0("configurationManager", rVar);
        this.f16409a = R4.b.D1(new d9.h(4, rVar));
        this.f16410b = AbstractC4344b.N0(c2969f);
        a(c2969f);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0158  */
    @Override // N9.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(C2969F c2969f) {
        M m10;
        T t10;
        Q q10;
        String str;
        String str2;
        String str3;
        String str4;
        EnumC1938a enumC1938a;
        EnumC2323o enumC2323o;
        C1939b c1939b;
        C1939b c1939b2;
        M m11;
        String str5;
        EnumC1938a enumC1938a2;
        C3963m c3963m;
        boolean z10;
        M m12;
        String str6;
        EnumC2323o enumC2323o2;
        AbstractC3557B.c0("message", c2969f);
        X x10 = c2969f.f30021n;
        if (x10 != null) {
            m10 = x10.f32047d;
        } else {
            m10 = null;
        }
        if (x10 != null) {
            t10 = x10.f32048e;
        } else {
            t10 = null;
        }
        if (x10 != null) {
            q10 = x10.f32049f;
        } else {
            q10 = null;
        }
        String str7 = c2969f.f30012e;
        EnumC2971H enumC2971H = c2969f.f30011d;
        if (q10 != null) {
            C1939b c1939b3 = this.f16411c;
            if (c1939b3 != null) {
                str6 = c1939b3.f24022b;
            } else {
                str6 = null;
            }
            if (!AbstractC3557B.K(str6, str7)) {
                c(EnumC2323o.f26407Z);
            }
            Integer num = q10.f13494d;
            if (num != null && num.intValue() == 200) {
                enumC2323o2 = EnumC2323o.f26407Z;
            } else {
                enumC2323o2 = EnumC2323o.f26409i0;
            }
            C1939b c1939b4 = this.f16411c;
            if (c1939b4 == null) {
                if (m10 == null) {
                    m10 = new M(null, null, null, null, 127);
                }
                EnumC1938a enumC1938a3 = EnumC1938a.f24016Y;
                c1939b4 = new C1939b(m10, str7, null, 24);
            }
            this.f16411c = C1939b.a(c1939b4, null, enumC2323o2, 23);
        } else {
            if (m10 != null) {
                C1939b c1939b5 = this.f16411c;
                if (c1939b5 != null) {
                    m11 = c1939b5.f24021a;
                } else {
                    m11 = null;
                }
                if (!AbstractC3557B.K(m10, m11)) {
                    C1939b c1939b6 = this.f16411c;
                    if (c1939b6 != null && (m12 = c1939b6.f24021a) != null) {
                        str5 = m12.f32017a;
                    } else {
                        str5 = null;
                    }
                    if (str5 != null && !AbstractC3557B.K(str5, "preview")) {
                        c(EnumC2323o.f26407Z);
                    }
                    if (!AbstractC3557B.K(m10.f32017a, "denied_by_user")) {
                        if (!m10.f32023g.isEmpty()) {
                            enumC1938a2 = EnumC1938a.f24019i0;
                        } else {
                            enumC1938a2 = EnumC1938a.f24016Y;
                        }
                        EnumC1938a enumC1938a4 = enumC1938a2;
                        EnumC2323o enumC2323o3 = EnumC2323o.f26406Y;
                        if (AbstractC3557B.K((String) this.f16409a.getValue(), m10.f32018b) && (!n.n2((String) c3963m.getValue()))) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.f16411c = new C1939b(m10, c2969f.f30012e, enumC1938a4, enumC2323o3, z10);
                    }
                }
            }
            if (t10 != null) {
                String str8 = t10.f32032a;
                if (str8 != null) {
                    int hashCode = str8.hashCode();
                    if (hashCode != 3079692) {
                        if (hashCode != 92906313) {
                            if (hashCode == 1811836507 && str8.equals("oauth_success")) {
                                enumC1938a = EnumC1938a.f24017Z;
                                if (str8 != null) {
                                    int hashCode2 = str8.hashCode();
                                    if (hashCode2 != 3079692) {
                                        if (hashCode2 != 92906313) {
                                            if (hashCode2 == 1811836507 && str8.equals("oauth_success")) {
                                                enumC2323o = EnumC2323o.f26407Z;
                                                c1939b = this.f16411c;
                                                if (c1939b != null) {
                                                    c1939b2 = C1939b.a(c1939b, enumC1938a, enumC2323o, 19);
                                                } else {
                                                    c1939b2 = null;
                                                }
                                                this.f16411c = c1939b2;
                                            }
                                        } else if (str8.equals("allow")) {
                                            enumC2323o = EnumC2323o.f26406Y;
                                            c1939b = this.f16411c;
                                            if (c1939b != null) {
                                            }
                                            this.f16411c = c1939b2;
                                        }
                                    } else if (str8.equals("deny")) {
                                        enumC2323o = EnumC2323o.f26408h0;
                                        c1939b = this.f16411c;
                                        if (c1939b != null) {
                                        }
                                        this.f16411c = c1939b2;
                                    }
                                }
                                enumC2323o = EnumC2323o.f26406Y;
                                c1939b = this.f16411c;
                                if (c1939b != null) {
                                }
                                this.f16411c = c1939b2;
                            }
                        } else if (str8.equals("allow")) {
                            enumC1938a = EnumC1938a.f24017Z;
                            if (str8 != null) {
                            }
                            enumC2323o = EnumC2323o.f26406Y;
                            c1939b = this.f16411c;
                            if (c1939b != null) {
                            }
                            this.f16411c = c1939b2;
                        }
                    } else if (str8.equals("deny")) {
                        enumC1938a = EnumC1938a.f24018h0;
                        if (str8 != null) {
                        }
                        enumC2323o = EnumC2323o.f26406Y;
                        c1939b = this.f16411c;
                        if (c1939b != null) {
                        }
                        this.f16411c = c1939b2;
                    }
                }
                enumC1938a = EnumC1938a.f24019i0;
                if (str8 != null) {
                }
                enumC2323o = EnumC2323o.f26406Y;
                c1939b = this.f16411c;
                if (c1939b != null) {
                }
                this.f16411c = c1939b2;
            } else if (enumC2971H == EnumC2971H.f30052l0) {
                C1939b c1939b7 = this.f16411c;
                if (c1939b7 != null) {
                    str = c1939b7.f24022b;
                } else {
                    str = null;
                }
                if (!AbstractC3557B.K(str, str7)) {
                    if (str7 != null && (str4 = (String) t.h2(n.G2(str7, new String[]{"__"}))) != null) {
                        str2 = n.A2(str4, "_", Separators.DOT);
                    } else {
                        str2 = null;
                    }
                    if (str7 != null) {
                        str3 = (String) t.p2(n.G2(str7, new String[]{Separators.DOT}));
                    } else {
                        str3 = null;
                    }
                    c(EnumC2323o.f26407Z);
                    M m13 = new M(str2, str3, null, null, 117);
                    EnumC1938a enumC1938a5 = EnumC1938a.f24016Y;
                    this.f16411c = new C1939b(m13, str7, W.J(c2969f), 16);
                }
            }
        }
        this.f16410b.add(c2969f);
        if (!W.O(c2969f) && !W.N(c2969f) && q10 == null) {
            return false;
        }
        if (enumC2971H == EnumC2971H.f30047Z) {
            this.f16413e = c2969f.f30015h;
        }
        C1939b c1939b8 = this.f16411c;
        if (c1939b8 != null) {
            int ordinal = W.J(c2969f).ordinal();
            EnumC2323o enumC2323o4 = c1939b8.f24024d;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        enumC2323o4 = EnumC2323o.f26409i0;
                    }
                } else {
                    enumC2323o4 = EnumC2323o.f26408h0;
                }
            } else if (enumC2323o4 == EnumC2323o.f26406Y) {
                enumC2323o4 = EnumC2323o.f26407Z;
            }
            this.f16411c = C1939b.a(c1939b8, null, enumC2323o4, 23);
        }
        return true;
    }

    @Override // N9.f
    public final List b(EnumC2323o enumC2323o) {
        AbstractC3557B.c0("replaceInProgress", enumC2323o);
        c(enumC2323o);
        return this.f16412d;
    }

    public final void c(EnumC2323o enumC2323o) {
        EnumC2323o enumC2323o2;
        C1939b c1939b = this.f16411c;
        ArrayList arrayList = this.f16412d;
        if (c1939b != null) {
            if (d.f16408a[W.H(this.f16410b).ordinal()] == 3) {
                enumC2323o2 = EnumC2323o.f26409i0;
            } else {
                enumC2323o2 = c1939b.f24024d.b(enumC2323o);
            }
            C1939b a5 = C1939b.a(c1939b, null, enumC2323o2, 23);
            arrayList.add(new C2317i(a5.f24024d, this.f16410b, this.f16413e, new C2325q(a5)));
            this.f16410b = new ArrayList();
            this.f16411c = null;
            this.f16413e = null;
        } else if (this.f16413e != null) {
            arrayList.add(new C2316h((C2969F) t.o2(this.f16410b)));
        }
    }
}
