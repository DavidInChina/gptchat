package g2;

import Pg.C1171d;
import android.content.Context;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5156c;

/* renamed from: g2.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3155m {

    /* renamed from: a  reason: collision with root package name */
    public final String f31117a;

    /* renamed from: b  reason: collision with root package name */
    public final Pg.k f31118b = Bi.c.d(Integer.MAX_VALUE, null, 6);

    public AbstractC3155m(String str) {
        this.f31117a = str;
    }

    public abstract Object a(Context context, X1.j jVar, AbstractC4825e abstractC4825e);

    public abstract Object b(Context context, Object obj, AbstractC4825e abstractC4825e);

    /* JADX WARN: Can't wrap try/catch for region: R(6:2|(2:4|(4:6|8|33|(1:(1:(5:12|13|14|21|(1:23)(5:24|25|(5:27|(1:29)|14|21|(0)(0))|30|31))(2:15|16))(6:17|18|25|(0)|30|31))(4:19|20|21|(0)(0))))|7|8|33|(0)(0)) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077 A[Catch: v -> 0x008f, TRY_LEAVE, TryCatch #0 {v -> 0x008f, blocks: (B:13:0x002e, B:18:0x0046, B:20:0x004d, B:21:0x0058, B:25:0x006f, B:27:0x0077), top: B:33:0x0020 }] */
    /* JADX WARN: Type inference failed for: r10v4, types: [wf.k] */
    /* JADX WARN: Type inference failed for: r10v6, types: [wf.k] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x008c -> B:14:0x0031). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Context context, C3140E c3140e, AbstractC4825e abstractC4825e) {
        C3154l c3154l;
        int i10;
        C3140E c3140e2;
        C1171d c1171d;
        AbstractC3155m abstractC3155m;
        Context context2;
        AbstractC3155m abstractC3155m2;
        C3140E c3140e3;
        C1171d c1171d2;
        Object a5;
        if (abstractC4825e instanceof C3154l) {
            c3154l = (C3154l) abstractC4825e;
            int i11 = c3154l.f31116l0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3154l.f31116l0 = i11 - Integer.MIN_VALUE;
                Object obj = c3154l.f31114j0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c3154l.f31116l0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            c1171d = c3154l.f31113i0;
                            ?? r10 = c3154l.f31112h0;
                            context2 = c3154l.f31111Z;
                            abstractC3155m = c3154l.f31110Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            C3140E c3140e4 = r10;
                            abstractC3155m2 = abstractC3155m;
                            Context context3 = context2;
                            c1171d2 = c1171d;
                            context = context3;
                            c3140e3 = c3140e4;
                            c3154l.f31110Y = abstractC3155m2;
                            c3154l.f31111Z = context;
                            c3154l.f31112h0 = c3140e3;
                            c3154l.f31113i0 = c1171d2;
                            c3154l.f31116l0 = 1;
                            a5 = c1171d2.a(c3154l);
                            if (a5 == enumC5000a) {
                                return enumC5000a;
                            }
                            C1171d c1171d3 = c1171d2;
                            context2 = context;
                            c1171d = c1171d3;
                            abstractC3155m = abstractC3155m2;
                            obj = a5;
                            c3140e2 = c3140e3;
                            if (((Boolean) obj).booleanValue()) {
                                Object b10 = c1171d.b();
                                c3140e2.invoke(b10);
                                c3154l.f31110Y = abstractC3155m;
                                c3154l.f31111Z = context2;
                                c3154l.f31112h0 = c3140e2;
                                c3154l.f31113i0 = c1171d;
                                c3154l.f31116l0 = 2;
                                c3140e4 = c3140e2;
                                if (abstractC3155m.b(context2, b10, c3154l) == enumC5000a) {
                                    return enumC5000a;
                                }
                                abstractC3155m2 = abstractC3155m;
                                Context context32 = context2;
                                c1171d2 = c1171d;
                                context = context32;
                                c3140e3 = c3140e4;
                                c3154l.f31110Y = abstractC3155m2;
                                c3154l.f31111Z = context;
                                c3154l.f31112h0 = c3140e3;
                                c3154l.f31113i0 = c1171d2;
                                c3154l.f31116l0 = 1;
                                a5 = c1171d2.a(c3154l);
                                if (a5 == enumC5000a) {
                                }
                            }
                            return jf.y.f36177a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1171d = c3154l.f31113i0;
                    ?? r102 = c3154l.f31112h0;
                    context2 = c3154l.f31111Z;
                    abstractC3155m = c3154l.f31110Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    c3140e2 = r102;
                    if (((Boolean) obj).booleanValue()) {
                    }
                    return jf.y.f36177a;
                }
                com.google.android.gms.internal.play_billing.N.B0(obj);
                Pg.k kVar = this.f31118b;
                kVar.getClass();
                c1171d2 = new C1171d(kVar);
                abstractC3155m2 = this;
                c3140e3 = c3140e;
                c3154l.f31110Y = abstractC3155m2;
                c3154l.f31111Z = context;
                c3154l.f31112h0 = c3140e3;
                c3154l.f31113i0 = c1171d2;
                c3154l.f31116l0 = 1;
                a5 = c1171d2.a(c3154l);
                if (a5 == enumC5000a) {
                }
            }
        }
        c3154l = new C3154l(this, abstractC4825e);
        Object obj2 = c3154l.f31114j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c3154l.f31116l0;
        if (i10 == 0) {
        }
    }

    public final Object d(Object obj, AbstractC5156c abstractC5156c) {
        Object n10 = this.f31118b.n(obj, abstractC5156c);
        if (n10 == EnumC5000a.f41328Y) {
            return n10;
        }
        return jf.y.f36177a;
    }
}
