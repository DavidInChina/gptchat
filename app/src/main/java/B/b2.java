package B;

import A.C0036p;
import h.C3281g;
import jf.AbstractC3953c;
import l0.AbstractC4327s;
import l0.C4310b;
import nf.AbstractC4825e;
import of.EnumC5000a;
import wf.AbstractC6216a;
import z.AbstractC6652A0;
import z.AbstractC6654B0;
import z.AbstractC6714o;
import z.C6718q;

/* loaded from: classes.dex */
public final class b2 {

    /* renamed from: f  reason: collision with root package name */
    public static final C6718q f1276f = new C6718q(0.0f);

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC6654B0 f1277a;

    /* renamed from: b  reason: collision with root package name */
    public long f1278b = Long.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public C6718q f1279c = f1276f;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1280d;

    /* renamed from: e  reason: collision with root package name */
    public float f1281e;

    public b2(AbstractC6714o abstractC6714o) {
        this.f1277a = abstractC6714o.mo121a(AbstractC6652A0.f51116a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bc, code lost:
        if (r13 != 0.0f) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Type inference failed for: r12v4, types: [wf.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [B.b2] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00b4 -> B:35:0x00b7). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C3281g c3281g, C0110b c0110b, AbstractC4825e abstractC4825e) {
        a2 a2Var;
        int i10;
        Throwable th2;
        float f6;
        a2 a2Var2;
        b2 b2Var;
        C0110b c0110b2;
        AbstractC3953c abstractC3953c;
        b2 b2Var2;
        AbstractC6216a abstractC6216a;
        float f10;
        try {
            if (abstractC4825e instanceof a2) {
                a2Var = (a2) abstractC4825e;
                int i11 = a2Var.f1268l0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    a2Var.f1268l0 = i11 - Integer.MIN_VALUE;
                    Object obj = a2Var.f1266j0;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = a2Var.f1268l0;
                    C6718q c6718q = f1276f;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                abstractC6216a = (AbstractC6216a) a2Var.f1263Z;
                                b2 b2Var3 = a2Var.f1262Y;
                                com.google.android.gms.internal.play_billing.N.B0(obj);
                                a2Var = b2Var3;
                                abstractC6216a.mo122invoke();
                                b2Var2 = a2Var;
                                b2Var2.f1278b = Long.MIN_VALUE;
                                b2Var2.f1279c = c6718q;
                                b2Var2.f1280d = false;
                                return jf.y.f36177a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        float f11 = a2Var.f1265i0;
                        ?? r12 = a2Var.f1264h0;
                        AbstractC3953c abstractC3953c2 = (wf.k) a2Var.f1263Z;
                        b2 b2Var4 = a2Var.f1262Y;
                        try {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            abstractC3953c = abstractC3953c2;
                            f6 = f11;
                            b2Var = b2Var4;
                            a2Var2 = a2Var;
                            c0110b2 = r12;
                            c0110b2.mo122invoke();
                        } catch (Throwable th3) {
                            th2 = th3;
                            a2Var = b2Var4;
                            a2Var.f1278b = Long.MIN_VALUE;
                            a2Var.f1279c = c6718q;
                            a2Var.f1280d = false;
                            throw th2;
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        if (!this.f1280d) {
                            AbstractC4327s abstractC4327s = (AbstractC4327s) a2Var.getContext().get(C4310b.f37708u0);
                            if (abstractC4327s != null) {
                                f10 = abstractC4327s.a0();
                            } else {
                                f10 = 1.0f;
                            }
                            this.f1280d = true;
                            f6 = f10;
                            b2Var = this;
                            a2Var2 = a2Var;
                            abstractC3953c = c3281g;
                            c0110b2 = c0110b;
                            try {
                                if (Math.abs(b2Var.f1281e) >= 0.01f) {
                                    C0036p c0036p = new C0036p(b2Var, f6, abstractC3953c, 1);
                                    a2Var2.f1262Y = b2Var;
                                    a2Var2.f1263Z = abstractC3953c;
                                    a2Var2.f1264h0 = c0110b2;
                                    a2Var2.f1265i0 = f6;
                                    a2Var2.f1268l0 = 1;
                                    if (kotlin.jvm.internal.m.v(a2Var2.getContext()).S(c0036p, a2Var2) == enumC5000a) {
                                        return enumC5000a;
                                    }
                                    c0110b2.mo122invoke();
                                }
                                b2 b2Var5 = b2Var;
                                C0110b c0110b3 = c0110b2;
                                b2 b2Var6 = b2Var5;
                                if (Math.abs(b2Var6.f1281e) != 0.0f) {
                                    J j6 = new J(b2Var6, 2, abstractC3953c);
                                    a2Var2.f1262Y = b2Var6;
                                    a2Var2.f1263Z = c0110b3;
                                    a2Var2.f1264h0 = null;
                                    a2Var2.f1268l0 = 2;
                                    if (kotlin.jvm.internal.m.v(a2Var2.getContext()).S(j6, a2Var2) == enumC5000a) {
                                        return enumC5000a;
                                    }
                                    abstractC6216a = c0110b3;
                                    a2Var = b2Var6;
                                    abstractC6216a.mo122invoke();
                                    b2Var2 = a2Var;
                                    b2Var2.f1278b = Long.MIN_VALUE;
                                    b2Var2.f1279c = c6718q;
                                    b2Var2.f1280d = false;
                                    return jf.y.f36177a;
                                }
                                b2Var2 = b2Var6;
                                b2Var2.f1278b = Long.MIN_VALUE;
                                b2Var2.f1279c = c6718q;
                                b2Var2.f1280d = false;
                                return jf.y.f36177a;
                            } catch (Throwable th4) {
                                th2 = th4;
                                a2Var = b2Var;
                                a2Var.f1278b = Long.MIN_VALUE;
                                a2Var.f1279c = c6718q;
                                a2Var.f1280d = false;
                                throw th2;
                            }
                        }
                        throw new IllegalStateException("animateToZero called while previous animation is running".toString());
                    }
                }
            }
            if (i10 == 0) {
            }
        } catch (Throwable th5) {
            th2 = th5;
        }
        a2Var = new a2(this, abstractC4825e);
        Object obj2 = a2Var.f1266j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = a2Var.f1268l0;
        C6718q c6718q2 = f1276f;
    }
}
