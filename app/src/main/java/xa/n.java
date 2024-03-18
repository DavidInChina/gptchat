package xa;

import java.util.List;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class n extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public s f49740Y;

    /* renamed from: Z  reason: collision with root package name */
    public List f49741Z;

    /* renamed from: h0  reason: collision with root package name */
    public Yg.p f49742h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f49743i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f49744j0;

    /* renamed from: k0  reason: collision with root package name */
    public /* synthetic */ Object f49745k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ s f49746l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f49747m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s sVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f49746l0 = sVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f49745k0 = obj;
        this.f49747m0 |= Integer.MIN_VALUE;
        return this.f49746l0.c(this);
    }
}
