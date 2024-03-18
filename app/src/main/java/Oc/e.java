package oc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class e extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public k f41253Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f41254Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ k f41255h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f41256i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f41255h0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f41254Z = obj;
        this.f41256i0 |= Integer.MIN_VALUE;
        return k.n(this.f41255h0, null, false, this);
    }
}
