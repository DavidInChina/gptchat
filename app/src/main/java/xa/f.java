package xa;

import L9.AbstractC0904j;
import L9.S;
import ca.C2311c;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import o9.C4957e;
import of.EnumC5000a;
import wd.C6168C;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;
import x8.W;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class f implements Ea.a {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0904j f49714a;

    /* renamed from: b  reason: collision with root package name */
    public final U9.a f49715b;

    public f(AbstractC0904j abstractC0904j, U9.a aVar) {
        this.f49714a = abstractC0904j;
        this.f49715b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C2311c c2311c, boolean z10, AbstractC4825e abstractC4825e) {
        C6384a c6384a;
        int i10;
        v0 v0Var;
        v0 v0Var2;
        f fVar;
        v0 v0Var3;
        if (abstractC4825e instanceof C6384a) {
            c6384a = (C6384a) abstractC4825e;
            int i11 = c6384a.f49691k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6384a.f49691k0 = i11 - Integer.MIN_VALUE;
                Object obj = c6384a.f49689i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c6384a.f49691k0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                N.B0(obj);
                                v0Var = (v0) obj;
                                if (v0Var instanceof q0) {
                                    return (q0) v0Var;
                                }
                                return new u0(y.f36177a);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        N.B0(obj);
                        v0Var2 = (v0) obj;
                        if (v0Var2 instanceof q0) {
                            return (q0) v0Var2;
                        }
                        return new u0(y.f36177a);
                    }
                    z10 = c6384a.f49688h0;
                    c2311c = c6384a.f49687Z;
                    fVar = c6384a.f49686Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    c6384a.f49686Y = this;
                    c6384a.f49687Z = c2311c;
                    c6384a.f49688h0 = z10;
                    c6384a.f49691k0 = 1;
                    obj = ((Fa.i) this.f49714a).a(c2311c, z10, c6384a);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    fVar = this;
                }
                v0Var3 = (v0) obj;
                if (!(v0Var3 instanceof q0)) {
                    return (q0) v0Var3;
                }
                if (z10) {
                    U9.a aVar = fVar.f49715b;
                    c6384a.f49686Y = null;
                    c6384a.f49687Z = null;
                    c6384a.f49691k0 = 2;
                    obj = ((Ia.l) aVar).b(c2311c, c6384a);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    v0Var2 = (v0) obj;
                    if (v0Var2 instanceof q0) {
                    }
                    return new u0(y.f36177a);
                }
                U9.a aVar2 = fVar.f49715b;
                c6384a.f49686Y = null;
                c6384a.f49687Z = null;
                c6384a.f49691k0 = 3;
                obj = ((Ia.l) aVar2).f(c2311c, true, c6384a);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
                v0Var = (v0) obj;
                if (v0Var instanceof q0) {
                }
                return new u0(y.f36177a);
            }
        }
        c6384a = new C6384a(this, abstractC4825e);
        Object obj2 = c6384a.f49689i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c6384a.f49691k0;
        if (i10 == 0) {
        }
        v0Var3 = (v0) obj2;
        if (!(v0Var3 instanceof q0)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(C2311c c2311c, AbstractC4825e abstractC4825e) {
        C6385b c6385b;
        int i10;
        v0 v0Var;
        f fVar;
        v0 v0Var2;
        if (abstractC4825e instanceof C6385b) {
            c6385b = (C6385b) abstractC4825e;
            int i11 = c6385b.f49696j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6385b.f49696j0 = i11 - Integer.MIN_VALUE;
                Object obj = c6385b.f49694h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c6385b.f49696j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            v0Var = (v0) obj;
                            if (!(v0Var instanceof q0)) {
                                return (q0) v0Var;
                            }
                            return new u0(y.f36177a);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2311c = c6385b.f49693Z;
                    fVar = c6385b.f49692Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    c6385b.f49692Y = this;
                    c6385b.f49693Z = c2311c;
                    c6385b.f49696j0 = 1;
                    obj = ((Fa.i) this.f49714a).c(c2311c, c6385b);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    fVar = this;
                }
                v0Var2 = (v0) obj;
                if (!(v0Var2 instanceof q0)) {
                    return (q0) v0Var2;
                }
                U9.a aVar = fVar.f49715b;
                c6385b.f49692Y = null;
                c6385b.f49693Z = null;
                c6385b.f49696j0 = 2;
                obj = ((Ia.l) aVar).b(c2311c, c6385b);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
                v0Var = (v0) obj;
                if (!(v0Var instanceof q0)) {
                }
            }
        }
        c6385b = new C6385b(this, abstractC4825e);
        Object obj2 = c6385b.f49694h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c6385b.f49696j0;
        if (i10 == 0) {
        }
        v0Var2 = (v0) obj2;
        if (!(v0Var2 instanceof q0)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, AbstractC4825e abstractC4825e) {
        C6386c c6386c;
        int i10;
        v0 v0Var;
        v0 v0Var2;
        f fVar;
        Object obj;
        String str3;
        S s10;
        C2311c c2311c;
        Object f6;
        String str4 = str;
        if (abstractC4825e instanceof C6386c) {
            c6386c = (C6386c) abstractC4825e;
            int i11 = c6386c.f49703l0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6386c.f49703l0 = i11 - Integer.MIN_VALUE;
                Object obj2 = c6386c.f49701j0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c6386c.f49703l0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                v0Var2 = (v0) c6386c.f49697Y;
                                N.B0(obj2);
                                v0Var = v0Var2;
                                if (v0Var instanceof u0) {
                                    S s11 = (S) ((u0) v0Var).f48468a;
                                    return new u0(y.f36177a);
                                } else if ((v0Var instanceof p0) || (v0Var instanceof q0)) {
                                    return v0Var;
                                } else {
                                    throw new RuntimeException();
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s10 = c6386c.f49700i0;
                        v0 v0Var3 = c6386c.f49699h0;
                        String str5 = c6386c.f49698Z;
                        fVar = (f) c6386c.f49697Y;
                        N.B0(obj2);
                        obj = obj2;
                        v0Var = v0Var3;
                        str3 = str5;
                        c2311c = (C2311c) obj;
                        if (c2311c == null) {
                            U9.a aVar = fVar.f49715b;
                            Yg.p.Companion.getClass();
                            C2311c a5 = C2311c.a(c2311c, null, null, new Yg.p(AbstractC6463a.n("instant(...)")), null, s10.f10893a, null, null, null, null, 16343);
                            c6386c.f49697Y = v0Var;
                            c6386c.f49698Z = null;
                            c6386c.f49699h0 = null;
                            c6386c.f49700i0 = null;
                            c6386c.f49703l0 = 3;
                            f6 = ((Ia.l) aVar).f(a5, true, c6386c);
                            if (f6 == enumC5000a) {
                                return enumC5000a;
                            }
                            v0Var2 = v0Var;
                            v0Var = v0Var2;
                            if (v0Var instanceof u0) {
                            }
                        } else {
                            Pc.c a10 = Pc.e.a();
                            String a11 = C6168C.a(str3);
                            W.M(a10, "Conversation is missing in the cache: " + a11, null, 6);
                            if (v0Var instanceof u0) {
                            }
                        }
                    } else {
                        str4 = c6386c.f49698Z;
                        N.B0(obj2);
                        fVar = (f) c6386c.f49697Y;
                    }
                } else {
                    N.B0(obj2);
                    c6386c.f49697Y = this;
                    c6386c.f49698Z = str4;
                    c6386c.f49703l0 = 1;
                    obj2 = ((Fa.i) this.f49714a).g(str4, str2, c6386c);
                    if (obj2 == enumC5000a) {
                        return enumC5000a;
                    }
                    fVar = this;
                }
                v0Var = (v0) obj2;
                if (v0Var instanceof u0) {
                    S s12 = (S) ((u0) v0Var).f48468a;
                    if (s12.f10893a != null) {
                        C4957e e10 = ((Ia.l) fVar.f49715b).e(str4);
                        c6386c.f49697Y = fVar;
                        c6386c.f49698Z = str4;
                        c6386c.f49699h0 = v0Var;
                        c6386c.f49700i0 = s12;
                        c6386c.f49703l0 = 2;
                        obj = L4.a.m0(e10, c6386c);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        str3 = str4;
                        s10 = s12;
                        c2311c = (C2311c) obj;
                        if (c2311c == null) {
                        }
                    } else {
                        String str6 = s12.f10894b;
                        if (str6 != null) {
                            W.F(Pc.e.a(), "Title generation message: ".concat(str6), null, 6);
                        }
                    }
                }
                if (v0Var instanceof u0) {
                }
            }
        }
        c6386c = new C6386c(this, abstractC4825e);
        Object obj22 = c6386c.f49701j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c6386c.f49703l0;
        if (i10 == 0) {
        }
        v0Var = (v0) obj22;
        if (v0Var instanceof u0) {
        }
        if (v0Var instanceof u0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(C2311c c2311c, AbstractC4825e abstractC4825e) {
        C6387d c6387d;
        int i10;
        v0 v0Var;
        v0 v0Var2;
        f fVar;
        Object f6;
        if (abstractC4825e instanceof C6387d) {
            c6387d = (C6387d) abstractC4825e;
            int i11 = c6387d.f49707i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6387d.f49707i0 = i11 - Integer.MIN_VALUE;
                Object obj = c6387d.f49705Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c6387d.f49707i0;
                y yVar = y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            v0Var2 = (v0) c6387d.f49704Y;
                            N.B0(obj);
                            v0Var = v0Var2;
                            if (v0Var instanceof u0) {
                                C2311c c2311c2 = (C2311c) ((u0) v0Var).f48468a;
                                return new u0(yVar);
                            } else if ((v0Var instanceof p0) || (v0Var instanceof q0)) {
                                return v0Var;
                            } else {
                                throw new RuntimeException();
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = (f) c6387d.f49704Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    String str = c2311c.f26375b;
                    if (str == null) {
                        return new u0(yVar);
                    }
                    c6387d.f49704Y = this;
                    c6387d.f49707i0 = 1;
                    obj = ((Fa.i) this.f49714a).e(c2311c.f26374a, str, c6387d);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    fVar = this;
                }
                v0Var = (v0) obj;
                if (v0Var instanceof u0) {
                    U9.a aVar = fVar.f49715b;
                    c6387d.f49704Y = v0Var;
                    c6387d.f49707i0 = 2;
                    f6 = ((Ia.l) aVar).f((C2311c) ((u0) v0Var).f48468a, true, c6387d);
                    if (f6 == enumC5000a) {
                        return enumC5000a;
                    }
                    v0Var2 = v0Var;
                    v0Var = v0Var2;
                }
                if (v0Var instanceof u0) {
                }
            }
        }
        c6387d = new C6387d(this, abstractC4825e);
        Object obj2 = c6387d.f49705Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c6387d.f49707i0;
        y yVar2 = y.f36177a;
        if (i10 == 0) {
        }
        v0Var = (v0) obj2;
        if (v0Var instanceof u0) {
        }
        if (v0Var instanceof u0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(C2311c c2311c, String str, AbstractC4825e abstractC4825e) {
        e eVar;
        int i10;
        v0 v0Var;
        String str2;
        C2311c c2311c2;
        f fVar;
        v0 v0Var2;
        if (abstractC4825e instanceof e) {
            eVar = (e) abstractC4825e;
            int i11 = eVar.f49713k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f49713k0 = i11 - Integer.MIN_VALUE;
                Object obj = eVar.f49711i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = eVar.f49713k0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            v0Var = (v0) obj;
                            if (!(v0Var instanceof q0)) {
                                return (q0) v0Var;
                            }
                            return new u0(y.f36177a);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str3 = eVar.f49710h0;
                    C2311c c2311c3 = eVar.f49709Z;
                    fVar = eVar.f49708Y;
                    N.B0(obj);
                    str2 = str3;
                    c2311c2 = c2311c3;
                } else {
                    N.B0(obj);
                    eVar.f49708Y = this;
                    eVar.f49709Z = c2311c;
                    eVar.f49710h0 = str;
                    eVar.f49713k0 = 1;
                    obj = ((Fa.i) this.f49714a).h(c2311c, str, eVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    fVar = this;
                    c2311c2 = c2311c;
                    str2 = str;
                }
                v0Var2 = (v0) obj;
                if (!(v0Var2 instanceof q0)) {
                    return (q0) v0Var2;
                }
                U9.a aVar = fVar.f49715b;
                Yg.p.Companion.getClass();
                C2311c a5 = C2311c.a(c2311c2, null, null, new Yg.p(AbstractC6463a.n("instant(...)")), null, str2, null, null, null, null, 16343);
                eVar.f49708Y = null;
                eVar.f49709Z = null;
                eVar.f49710h0 = null;
                eVar.f49713k0 = 2;
                obj = ((Ia.l) aVar).f(a5, true, eVar);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
                v0Var = (v0) obj;
                if (!(v0Var instanceof q0)) {
                }
            }
        }
        eVar = new e(this, abstractC4825e);
        Object obj2 = eVar.f49711i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = eVar.f49713k0;
        if (i10 == 0) {
        }
        v0Var2 = (v0) obj2;
        if (!(v0Var2 instanceof q0)) {
        }
    }
}
