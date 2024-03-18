package oh;

import A.B0;
import com.google.android.gms.internal.play_billing.N;
import java.util.concurrent.CancellationException;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: oh.D  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5012D extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public kotlin.jvm.internal.B f41367Y;

    /* renamed from: Z  reason: collision with root package name */
    public kotlin.jvm.internal.B f41368Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f41369h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f41370i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ I f41371j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5012D(I i10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41371j0 = i10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C5012D c5012d = new C5012D(this.f41371j0, abstractC4825e);
        c5012d.f41370i0 = obj;
        return c5012d;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5012D) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e A[Catch: CancellationException -> 0x0037, TryCatch #1 {CancellationException -> 0x0037, blocks: (B:26:0x0078, B:28:0x007e, B:31:0x0084), top: B:39:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084 A[Catch: CancellationException -> 0x0037, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0037, blocks: (B:26:0x0078, B:28:0x007e, B:31:0x0084), top: B:39:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v11, types: [kotlin.jvm.internal.B, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0076 -> B:39:0x0078). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0091 -> B:14:0x0037). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ng.F f6;
        kotlin.jvm.internal.B b10;
        Object obj2;
        C5009A c5009a;
        Ng.F f10;
        kotlin.jvm.internal.B b11;
        kotlin.jvm.internal.B b12;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41369h0;
        I i11 = this.f41371j0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    b10 = this.f41367Y;
                    Ng.F f11 = (Ng.F) this.f41370i0;
                    try {
                        N.B0(obj);
                        f6 = f11;
                    } catch (CancellationException unused) {
                        f6 = f11;
                    }
                    obj2 = b10.f37622Y;
                    if (!(obj2 instanceof C5009A)) {
                        c5009a = (C5009A) obj2;
                    } else {
                        c5009a = null;
                    }
                    if (c5009a != null) {
                        i11.f41385A0.invoke(new Z0.p(c5009a.f41346j));
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.jvm.internal.B b13 = this.f41368Z;
                b11 = this.f41367Y;
                f10 = (Ng.F) this.f41370i0;
                N.B0(obj);
                b12 = b13;
                b12.f37622Y = obj;
                if (b11.f37622Y instanceof z) {
                    C5018e c5018e = i11.f41388u0;
                    B0 b02 = B0.f15Z;
                    C5011C c5011c = new C5011C(b11, i11, null);
                    this.f41370i0 = f10;
                    this.f41367Y = b11;
                    this.f41368Z = null;
                    this.f41369h0 = 2;
                    if (c5018e.a(b02, c5011c, this) == enumC5000a) {
                        return enumC5000a;
                    }
                    b10 = b11;
                    f6 = f10;
                    obj2 = b10.f37622Y;
                    if (!(obj2 instanceof C5009A)) {
                    }
                    if (c5009a != null) {
                    }
                }
                f6 = f10;
            }
        } else {
            N.B0(obj);
            f6 = (Ng.F) this.f41370i0;
        }
        if (!Ad.l.F0(f6)) {
            ?? obj3 = new Object();
            Pg.k kVar = i11.f41386B0;
            this.f41370i0 = f6;
            this.f41367Y = obj3;
            this.f41368Z = obj3;
            this.f41369h0 = 1;
            Object g10 = kVar.g(this);
            if (g10 == enumC5000a) {
                return enumC5000a;
            }
            f10 = f6;
            obj = g10;
            b11 = obj3;
            b12 = obj3;
            b12.f37622Y = obj;
            if (b11.f37622Y instanceof z) {
            }
            f6 = f10;
            if (!Ad.l.F0(f6)) {
                return jf.y.f36177a;
            }
        }
    }
}
