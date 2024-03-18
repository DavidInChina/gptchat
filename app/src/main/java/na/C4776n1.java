package na;

import com.openai.experiment.ExperimentKey;
import id.AbstractC3557B;
import za.C6807x;

/* renamed from: na.n1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4776n1 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ B1 f40070Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Z f40071Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4776n1(B1 b1, Z z10) {
        super(1);
        this.f40070Y = b1;
        this.f40071Z = z10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        long j6;
        C6807x c6807x = (C6807x) obj;
        AbstractC3557B.c0("$this$update", c6807x);
        boolean c10 = ((com.openai.experiment.G) this.f40070Y.f39709j).c(ExperimentKey.WhisperTextSelectDisabled.INSTANCE);
        Z z10 = this.f40071Z;
        if (c10) {
            j6 = N0.D.f12483b;
        } else if (!c10) {
            j6 = U3.f.e(0, ((Y) z10).f39891a.length());
        } else {
            throw new RuntimeException();
        }
        return C6807x.a(c6807x, new T0.z(((Y) z10).f39891a, j6, 4), null, null, false, null, 30);
    }
}
