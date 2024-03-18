package Ab;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class i extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f763Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ j f764Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f765h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f764Z = jVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f763Y = obj;
        this.f765h0 |= Integer.MIN_VALUE;
        return this.f764Z.a(null, null, this);
    }
}
