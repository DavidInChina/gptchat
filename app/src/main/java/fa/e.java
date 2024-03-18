package Fa;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class e extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public String f5123Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f5124Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f5125h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ i f5126i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f5127j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f5126i0 = iVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f5125h0 = obj;
        this.f5127j0 |= Integer.MIN_VALUE;
        return this.f5126i0.e(null, null, this);
    }
}
