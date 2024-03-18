package fh;

import eh.C2909i;
import eh.C2918r;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import jf.AbstractC3951a;
import jf.C3952b;
import kotlinx.serialization.json.JsonNull;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import nf.C4832l;
import of.EnumC5000a;
import pf.AbstractC5154a;
import pf.AbstractC5156c;
import pf.AbstractC5160g;

/* renamed from: fh.H  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3065H {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC3074a f30818a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f30819b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f30820c;

    /* renamed from: d  reason: collision with root package name */
    public int f30821d;

    public C3065H(C2909i c2909i, AbstractC3074a abstractC3074a) {
        AbstractC3557B.c0("configuration", c2909i);
        AbstractC3557B.c0("lexer", abstractC3074a);
        this.f30818a = abstractC3074a;
        this.f30819b = c2909i.f29443c;
        this.f30820c = c2909i.f29455o;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C3065H c3065h, C3952b c3952b, AbstractC4825e abstractC4825e) {
        C3064G c3064g;
        int i10;
        LinkedHashMap linkedHashMap;
        byte b10;
        C3065H c3065h2;
        LinkedHashMap linkedHashMap2;
        byte b11;
        AbstractC3074a abstractC3074a;
        String str;
        c3065h.getClass();
        if (abstractC4825e instanceof C3064G) {
            c3064g = (C3064G) abstractC4825e;
            int i11 = c3064g.f30817l0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3064g.f30817l0 = i11 - Integer.MIN_VALUE;
                Object obj = c3064g.f30815j0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c3064g.f30817l0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        String str2 = c3064g.f30814i0;
                        linkedHashMap = c3064g.f30813h0;
                        c3065h2 = c3064g.f30812Z;
                        C3952b c3952b2 = c3064g.f30811Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        linkedHashMap.put(str2, (kotlinx.serialization.json.b) obj);
                        b10 = c3065h2.f30818a.f();
                        if (b10 != 4) {
                            if (b10 != 7) {
                                AbstractC3074a.r(c3065h2.f30818a, "Expected end of the object or comma", 0, null, 6);
                                throw null;
                            }
                            AbstractC3074a abstractC3074a2 = c3065h2.f30818a;
                            if (b10 != 6) {
                                abstractC3074a2.g((byte) 7);
                            } else if (b10 == 4) {
                                if (c3065h2.f30820c) {
                                    abstractC3074a2.g((byte) 7);
                                } else {
                                    Bi.c.b1(abstractC3074a2);
                                    throw null;
                                }
                            }
                            return new kotlinx.serialization.json.c(linkedHashMap);
                        }
                        linkedHashMap2 = linkedHashMap;
                        c3952b = c3952b2;
                        b11 = b10;
                        c3065h = c3065h2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    AbstractC3074a abstractC3074a3 = c3065h.f30818a;
                    b11 = abstractC3074a3.g((byte) 6);
                    if (abstractC3074a3.w() != 4) {
                        linkedHashMap2 = new LinkedHashMap();
                    } else {
                        AbstractC3074a.r(abstractC3074a3, "Unexpected leading comma", 0, null, 6);
                        throw null;
                    }
                }
                abstractC3074a = c3065h.f30818a;
                if (!abstractC3074a.c()) {
                    if (c3065h.f30819b) {
                        str = abstractC3074a.l();
                    } else {
                        str = abstractC3074a.j();
                    }
                    abstractC3074a.g((byte) 5);
                    jf.y yVar = jf.y.f36177a;
                    c3064g.f30811Y = c3952b;
                    c3064g.f30812Z = c3065h;
                    c3064g.f30813h0 = linkedHashMap2;
                    c3064g.f30814i0 = str;
                    c3064g.f30817l0 = 1;
                    c3952b.getClass();
                    c3952b.f36144h0 = c3064g;
                    c3952b.f36143Z = yVar;
                    com.google.android.gms.internal.play_billing.N.k0(c3064g);
                    return enumC5000a;
                }
                linkedHashMap = linkedHashMap2;
                byte b12 = b11;
                c3065h2 = c3065h;
                b10 = b12;
                AbstractC3074a abstractC3074a22 = c3065h2.f30818a;
                if (b10 != 6) {
                }
                return new kotlinx.serialization.json.c(linkedHashMap);
            }
        }
        c3064g = new C3064G(c3065h, abstractC4825e);
        Object obj2 = c3064g.f30815j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c3064g.f30817l0;
        if (i10 == 0) {
        }
        abstractC3074a = c3065h.f30818a;
        if (!abstractC3074a.c()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [jf.b, java.lang.Object, nf.e] */
    public final kotlinx.serialization.json.b b() {
        kotlinx.serialization.json.b bVar;
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        AbstractC3074a abstractC3074a = this.f30818a;
        byte w10 = abstractC3074a.w();
        if (w10 == 1) {
            return d(true);
        }
        if (w10 == 0) {
            return d(false);
        }
        if (w10 == 6) {
            int i10 = this.f30821d + 1;
            this.f30821d = i10;
            if (i10 == 200) {
                C3063F c3063f = new C3063F(this, null);
                jf.y yVar = jf.y.f36177a;
                EnumC5000a enumC5000a = AbstractC3951a.f36141a;
                ?? obj4 = new Object();
                obj4.f36142Y = c3063f;
                obj4.f36143Z = yVar;
                obj4.f36144h0 = obj4;
                EnumC5000a enumC5000a2 = AbstractC3951a.f36141a;
                obj4.f36145i0 = enumC5000a2;
                while (true) {
                    obj = obj4.f36145i0;
                    AbstractC4825e abstractC4825e = obj4.f36144h0;
                    if (abstractC4825e == null) {
                        break;
                    } else if (AbstractC3557B.K(enumC5000a2, obj)) {
                        try {
                            wf.o oVar = obj4.f36142Y;
                            Object obj5 = obj4.f36143Z;
                            if (!(oVar instanceof AbstractC5154a)) {
                                AbstractC3557B.c0("<this>", oVar);
                                AbstractC4831k context = abstractC4825e.getContext();
                                if (context == C4832l.f40334Y) {
                                    obj3 = new AbstractC5160g(abstractC4825e);
                                } else {
                                    obj3 = new AbstractC5156c(abstractC4825e, context);
                                }
                                Ad.l.M(3, oVar);
                                obj2 = oVar.invoke(obj4, obj5, obj3);
                            } else {
                                Ad.l.M(3, oVar);
                                obj2 = oVar.invoke(obj4, obj5, abstractC4825e);
                            }
                            if (obj2 != EnumC5000a.f41328Y) {
                                abstractC4825e.resumeWith(obj2);
                            }
                        } catch (Throwable th2) {
                            abstractC4825e.resumeWith(com.google.android.gms.internal.play_billing.N.w(th2));
                        }
                    } else {
                        obj4.f36145i0 = enumC5000a2;
                        abstractC4825e.resumeWith(obj);
                    }
                }
                com.google.android.gms.internal.play_billing.N.B0(obj);
                bVar = (kotlinx.serialization.json.b) obj;
            } else {
                byte g10 = abstractC3074a.g((byte) 6);
                if (abstractC3074a.w() != 4) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (true) {
                        if (!abstractC3074a.c()) {
                            break;
                        }
                        if (this.f30819b) {
                            str = abstractC3074a.l();
                        } else {
                            str = abstractC3074a.j();
                        }
                        abstractC3074a.g((byte) 5);
                        linkedHashMap.put(str, b());
                        g10 = abstractC3074a.f();
                        if (g10 != 4) {
                            if (g10 != 7) {
                                AbstractC3074a.r(abstractC3074a, "Expected end of the object or comma", 0, null, 6);
                                throw null;
                            }
                        }
                    }
                    if (g10 == 6) {
                        abstractC3074a.g((byte) 7);
                    } else if (g10 == 4) {
                        if (this.f30820c) {
                            abstractC3074a.g((byte) 7);
                        } else {
                            Bi.c.b1(abstractC3074a);
                            throw null;
                        }
                    }
                    bVar = new kotlinx.serialization.json.c(linkedHashMap);
                } else {
                    AbstractC3074a.r(abstractC3074a, "Unexpected leading comma", 0, null, 6);
                    throw null;
                }
            }
            this.f30821d--;
            return bVar;
        } else if (w10 == 8) {
            return c();
        } else {
            AbstractC3074a.r(abstractC3074a, "Cannot read Json element because of unexpected ".concat(Ad.l.k1(w10)), 0, null, 6);
            throw null;
        }
    }

    public final kotlinx.serialization.json.a c() {
        boolean z10;
        AbstractC3074a abstractC3074a = this.f30818a;
        byte f6 = abstractC3074a.f();
        if (abstractC3074a.w() != 4) {
            ArrayList arrayList = new ArrayList();
            while (abstractC3074a.c()) {
                arrayList.add(b());
                f6 = abstractC3074a.f();
                if (f6 != 4) {
                    if (f6 == 9) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i10 = abstractC3074a.f30855a;
                    if (!z10) {
                        AbstractC3074a.r(abstractC3074a, "Expected end of the array or comma", i10, null, 4);
                        throw null;
                    }
                }
            }
            if (f6 == 8) {
                abstractC3074a.g((byte) 9);
            } else if (f6 == 4) {
                if (this.f30820c) {
                    abstractC3074a.g((byte) 9);
                } else {
                    Bi.c.a1(abstractC3074a, "array");
                    throw null;
                }
            }
            return new kotlinx.serialization.json.a(arrayList);
        }
        AbstractC3074a.r(abstractC3074a, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    public final kotlinx.serialization.json.d d(boolean z10) {
        String str;
        boolean z11 = this.f30819b;
        AbstractC3074a abstractC3074a = this.f30818a;
        if (!z11 && z10) {
            str = abstractC3074a.j();
        } else {
            str = abstractC3074a.l();
        }
        if (!z10 && AbstractC3557B.K(str, "null")) {
            return JsonNull.INSTANCE;
        }
        return new C2918r(str, z10, null);
    }
}
