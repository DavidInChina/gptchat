package e9;

import android.app.Application;
import cb.C2334C;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: e9.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2817j extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Application f29073Y;

    /* renamed from: Z  reason: collision with root package name */
    public C2334C f29074Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f29075h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C2820m f29076i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f29077j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2817j(C2820m c2820m, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f29076i0 = c2820m;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f29075h0 = obj;
        this.f29077j0 |= Integer.MIN_VALUE;
        return this.f29076i0.d(null, null, this);
    }
}
