package De;

import java.nio.charset.Charset;
import nf.AbstractC4825e;
import pf.AbstractC5156c;
import xe.C6417f;

/* loaded from: classes.dex */
public final class g extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public i f3607Y;

    /* renamed from: Z  reason: collision with root package name */
    public C6417f f3608Z;

    /* renamed from: h0  reason: collision with root package name */
    public Charset f3609h0;

    /* renamed from: i0  reason: collision with root package name */
    public Je.a f3610i0;

    /* renamed from: j0  reason: collision with root package name */
    public Object f3611j0;

    /* renamed from: k0  reason: collision with root package name */
    public /* synthetic */ Object f3612k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ i f3613l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f3614m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f3613l0 = iVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f3612k0 = obj;
        this.f3614m0 |= Integer.MIN_VALUE;
        return this.f3613l0.b(null, null, null, null, this);
    }
}
