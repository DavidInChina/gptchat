package Fc;

import com.google.android.gms.internal.play_billing.N;
import java.io.File;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class b extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ File f5186Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(File file, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f5186Y = file;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new b(this.f5186Y, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        ((b) create((AbstractC4825e) obj)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        this.f5186Y.delete();
        return y.f36177a;
    }
}
