package Db;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class a extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f3441Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ m f3442Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f3443h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m mVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f3442Z = mVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f3441Y = obj;
        this.f3443h0 |= Integer.MIN_VALUE;
        return this.f3442Z.a(this);
    }
}
