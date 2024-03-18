package M1;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* loaded from: classes2.dex */
public final class B {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Wg.a f11377a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f11378b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f11379c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ J f11380d;

    public B(Wg.a aVar, kotlin.jvm.internal.x xVar, kotlin.jvm.internal.B b10, J j6) {
        this.f11377a = aVar;
        this.f11378b = xVar;
        this.f11379c = b10;
        this.f11380d = j6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096 A[Catch: all -> 0x00d5, TRY_LEAVE, TryCatch #1 {all -> 0x00d5, blocks: (B:27:0x0092, B:29:0x0096, B:46:0x00d8, B:47:0x00df), top: B:52:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:19:0x0050, B:33:0x00ae, B:35:0x00b6), top: B:50:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8 A[Catch: all -> 0x00d5, TRY_ENTER, TryCatch #1 {all -> 0x00d5, blocks: (B:27:0x0092, B:29:0x0096, B:46:0x00d8, B:47:0x00df), top: B:52:0x0092 }] */
    /* JADX WARN: Type inference failed for: r11v1, types: [wf.n] */
    /* JADX WARN: Type inference failed for: r7v2, types: [Wg.a] */
    /* JADX WARN: Type inference failed for: r8v3, types: [wf.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C0926g c0926g, AbstractC4825e abstractC4825e) {
        A a5;
        int i10;
        Wg.d dVar;
        C0926g c0926g2;
        J j6;
        kotlin.jvm.internal.x xVar;
        kotlin.jvm.internal.B b10;
        Wg.d dVar2;
        Wg.a aVar;
        J j10;
        Object obj;
        kotlin.jvm.internal.B b11;
        try {
            if (abstractC4825e instanceof A) {
                a5 = (A) abstractC4825e;
                int i11 = a5.f11376m0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    a5.f11376m0 = i11 - Integer.MIN_VALUE;
                    Object obj2 = a5.f11374k0;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = a5.f11376m0;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 == 3) {
                                    obj = a5.f11371h0;
                                    b11 = (kotlin.jvm.internal.B) a5.f11370Z;
                                    dVar2 = (Wg.a) a5.f11369Y;
                                    try {
                                        N.B0(obj2);
                                        b11.f37622Y = obj;
                                        b10 = b11;
                                        Object obj3 = b10.f37622Y;
                                        ((Wg.d) dVar2).g(null);
                                        return obj3;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        dVar2.g(null);
                                        throw th;
                                    }
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j10 = (J) a5.f11371h0;
                            b10 = (kotlin.jvm.internal.B) a5.f11370Z;
                            aVar = (Wg.a) a5.f11369Y;
                            try {
                                N.B0(obj2);
                                if (AbstractC3557B.K(obj2, b10.f37622Y)) {
                                    a5.f11369Y = aVar;
                                    a5.f11370Z = b10;
                                    a5.f11371h0 = obj2;
                                    a5.f11376m0 = 3;
                                    if (j10.k(obj2, a5) == enumC5000a) {
                                        return enumC5000a;
                                    }
                                    obj = obj2;
                                    b11 = b10;
                                    dVar2 = aVar;
                                    b11.f37622Y = obj;
                                    b10 = b11;
                                    Object obj32 = b10.f37622Y;
                                    ((Wg.d) dVar2).g(null);
                                    return obj32;
                                }
                                dVar2 = aVar;
                                Object obj322 = b10.f37622Y;
                                ((Wg.d) dVar2).g(null);
                                return obj322;
                            } catch (Throwable th3) {
                                th = th3;
                                dVar2 = aVar;
                                dVar2.g(null);
                                throw th;
                            }
                        }
                        J j11 = a5.f11373j0;
                        b10 = a5.f11372i0;
                        xVar = (kotlin.jvm.internal.x) a5.f11371h0;
                        ?? r82 = (wf.n) a5.f11369Y;
                        N.B0(obj2);
                        dVar = (Wg.a) a5.f11370Z;
                        j6 = j11;
                        c0926g2 = r82;
                    } else {
                        N.B0(obj2);
                        a5.f11369Y = c0926g;
                        Wg.a aVar2 = this.f11377a;
                        a5.f11370Z = aVar2;
                        kotlin.jvm.internal.x xVar2 = this.f11378b;
                        a5.f11371h0 = xVar2;
                        kotlin.jvm.internal.B b12 = this.f11379c;
                        a5.f11372i0 = b12;
                        j6 = this.f11380d;
                        a5.f11373j0 = j6;
                        a5.f11376m0 = 1;
                        dVar = (Wg.d) aVar2;
                        if (dVar.e(null, a5) == enumC5000a) {
                            return enumC5000a;
                        }
                        xVar = xVar2;
                        b10 = b12;
                        c0926g2 = c0926g;
                    }
                    if (xVar.f37645Y) {
                        Object obj4 = b10.f37622Y;
                        a5.f11369Y = dVar;
                        a5.f11370Z = b10;
                        a5.f11371h0 = j6;
                        a5.f11372i0 = null;
                        a5.f11373j0 = null;
                        a5.f11376m0 = 2;
                        Object invoke = c0926g2.invoke(obj4, a5);
                        if (invoke == enumC5000a) {
                            return enumC5000a;
                        }
                        aVar = dVar;
                        obj2 = invoke;
                        j10 = j6;
                        if (AbstractC3557B.K(obj2, b10.f37622Y)) {
                        }
                    } else {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                }
            }
            if (xVar.f37645Y) {
            }
        } catch (Throwable th4) {
            th = th4;
            dVar2 = dVar;
            dVar2.g(null);
            throw th;
        }
        a5 = new A(this, abstractC4825e);
        Object obj22 = a5.f11374k0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = a5.f11376m0;
        if (i10 == 0) {
        }
    }
}
