package Ya;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class c extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public r f22149Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f22150Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f22151h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f22152i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ r f22153j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f22154k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r rVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f22153j0 = rVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f22152i0 = obj;
        this.f22154k0 |= Integer.MIN_VALUE;
        return this.f22153j0.b(null, this, false);
    }
}
