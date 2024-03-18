package z4;

import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import v4.C5971a;

/* renamed from: z4.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6769h extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C6770i f51619Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C5971a f51620Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ float f51621h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f51622i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ boolean f51623j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6769h(C6770i c6770i, C5971a c5971a, float f6, int i10, boolean z10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f51619Y = c6770i;
        this.f51620Z = c5971a;
        this.f51621h0 = f6;
        this.f51622i0 = i10;
        this.f51623j0 = z10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C6769h(this.f51619Y, this.f51620Z, this.f51621h0, this.f51622i0, this.f51623j0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        ((C6769h) create((AbstractC4825e) obj)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        C6770i c6770i = this.f51619Y;
        c6770i.f51632n0.setValue(this.f51620Z);
        c6770i.h(this.f51621h0);
        c6770i.g(this.f51622i0);
        c6770i.f51624Y.setValue(Boolean.FALSE);
        if (this.f51623j0) {
            c6770i.f51635q0.setValue(Long.MIN_VALUE);
        }
        return y.f36177a;
    }
}
