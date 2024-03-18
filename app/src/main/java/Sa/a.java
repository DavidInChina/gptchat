package Sa;

import com.google.android.gms.internal.play_billing.N;
import java.io.File;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.k;

/* loaded from: classes2.dex */
public final class a extends AbstractC5163j implements k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ File f16431Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(File file, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f16431Y = file;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new a(this.f16431Y, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        ((a) create((AbstractC4825e) obj)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        this.f16431Y.delete();
        return y.f36177a;
    }
}
