package M1;

import java.io.File;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class I extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public J f11408Y;

    /* renamed from: Z  reason: collision with root package name */
    public File f11409Z;

    /* renamed from: h0  reason: collision with root package name */
    public io.sentry.instrumentation.file.e f11410h0;

    /* renamed from: i0  reason: collision with root package name */
    public io.sentry.instrumentation.file.e f11411i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f11412j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ J f11413k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f11414l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(J j6, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f11413k0 = j6;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f11412j0 = obj;
        this.f11414l0 |= Integer.MIN_VALUE;
        return this.f11413k0.k(null, this);
    }
}
