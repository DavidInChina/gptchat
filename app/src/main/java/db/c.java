package Db;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class c extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f3447Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ m f3448Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f3449h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(m mVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f3448Z = mVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f3447Y = obj;
        this.f3449h0 |= Integer.MIN_VALUE;
        return this.f3448Z.b(null, this);
    }
}
