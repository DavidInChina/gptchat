package C9;

import b9.EnumC2132a;
import com.auth0.android.result.Credentials;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class d extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public l f2757Y;

    /* renamed from: Z  reason: collision with root package name */
    public Credentials f2758Z;

    /* renamed from: h0  reason: collision with root package name */
    public EnumC2132a f2759h0;

    /* renamed from: i0  reason: collision with root package name */
    public String f2760i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f2761j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ l f2762k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f2763l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f2762k0 = lVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f2761j0 = obj;
        this.f2763l0 |= Integer.MIN_VALUE;
        return this.f2762k0.d(null, null, this);
    }
}
