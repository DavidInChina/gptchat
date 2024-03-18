package xa;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class m extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public s f49735Y;

    /* renamed from: Z  reason: collision with root package name */
    public Wg.d f49736Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f49737h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ s f49738i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f49739j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s sVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f49738i0 = sVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f49737h0 = obj;
        this.f49739j0 |= Integer.MIN_VALUE;
        return s.a(this.f49738i0, this);
    }
}
