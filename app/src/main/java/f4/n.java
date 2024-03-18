package f4;

import android.graphics.Bitmap;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class n extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public q f29617Y;

    /* renamed from: Z  reason: collision with root package name */
    public q4.p f29618Z;

    /* renamed from: h0  reason: collision with root package name */
    public q4.j f29619h0;

    /* renamed from: i0  reason: collision with root package name */
    public e f29620i0;

    /* renamed from: j0  reason: collision with root package name */
    public Bitmap f29621j0;

    /* renamed from: k0  reason: collision with root package name */
    public /* synthetic */ Object f29622k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ q f29623l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f29624m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f29623l0 = qVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f29622k0 = obj;
        this.f29624m0 |= Integer.MIN_VALUE;
        return q.a(this.f29623l0, null, 0, this);
    }
}
