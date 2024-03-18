package ge;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: ge.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3259c extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f31589Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ d f31590Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f31591h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3259c(d dVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f31590Z = dVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f31589Y = obj;
        this.f31591h0 |= Integer.MIN_VALUE;
        return this.f31590Z.j(null, this);
    }
}
