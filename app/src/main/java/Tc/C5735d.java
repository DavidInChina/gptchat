package tc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: tc.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5735d extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f46073Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C5739h f46074Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f46075h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5735d(C5739h c5739h, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f46074Z = c5739h;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f46073Y = obj;
        this.f46075h0 |= Integer.MIN_VALUE;
        return this.f46074Z.a(this);
    }
}
