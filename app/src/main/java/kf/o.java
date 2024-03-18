package kf;

import com.google.android.gms.internal.play_billing.N;
import java.util.Iterator;
import wf.AbstractC6216a;
import xf.AbstractC6438a;

/* loaded from: classes.dex */
public final class o implements Iterable, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f37478Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f37479Z;

    public /* synthetic */ o(int i10, Object obj) {
        this.f37478Y = i10;
        this.f37479Z = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i10 = this.f37478Y;
        Object obj = this.f37479Z;
        switch (i10) {
            case 0:
                return N.f0((Object[]) obj);
            case 1:
                return new z((Iterator) ((AbstractC6216a) obj).mo122invoke());
            default:
                return ((Kg.k) obj).iterator();
        }
    }

    public o(zc.u uVar) {
        this.f37478Y = 1;
        this.f37479Z = uVar;
    }
}
