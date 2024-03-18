package W;

import H0.AbstractC0683i;
import H0.C0687k;
import H0.C0688k0;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.AbstractC6708l;

/* renamed from: W.j3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1570j3 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f20179Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1585m3 f20180Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0683i f20181h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1570j3(C1585m3 c1585m3, AbstractC0683i abstractC0683i, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f20180Z = c1585m3;
        this.f20181h0 = abstractC0683i;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C1570j3(this.f20180Z, this.f20181h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1570j3) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        long j6;
        int i10;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i11 = this.f20179Y;
        C1585m3 c1585m3 = this.f20180Z;
        if (i11 != 0) {
            if (i11 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            if (c1585m3 != null) {
                B3 b32 = c1585m3.f20227a;
                int c10 = b32.c();
                if (b32.b() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int f6 = AbstractC6708l.f(c10);
                long j10 = Long.MAX_VALUE;
                if (f6 != 0) {
                    if (f6 != 1) {
                        if (f6 == 2) {
                            j6 = Long.MAX_VALUE;
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        j6 = 10000;
                    }
                } else {
                    j6 = 4000;
                }
                AbstractC0683i abstractC0683i = this.f20181h0;
                if (abstractC0683i != null) {
                    C0687k c0687k = (C0687k) abstractC0683i;
                    if (j6 < 2147483647L) {
                        if (z10) {
                            i10 = 7;
                        } else {
                            i10 = 3;
                        }
                        int i12 = Build.VERSION.SDK_INT;
                        AccessibilityManager accessibilityManager = c0687k.f6967a;
                        if (i12 >= 29) {
                            int a5 = C0688k0.f6968a.a(accessibilityManager, (int) j6, i10);
                            if (a5 != Integer.MAX_VALUE) {
                                j10 = a5;
                            }
                        } else if (!z10 || !accessibilityManager.isTouchExplorationEnabled()) {
                            j10 = j6;
                        }
                        j6 = j10;
                    }
                }
                this.f20179Y = 1;
                if (R4.b.p0(j6, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
            return jf.y.f36177a;
        }
        c1585m3.a();
        return jf.y.f36177a;
    }
}
