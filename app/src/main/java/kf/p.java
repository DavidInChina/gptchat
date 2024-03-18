package kf;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.io.BufferedReader;
import java.util.Iterator;
import q1.AbstractC5260f;
import uf.C5918k;

/* loaded from: classes.dex */
public final class p implements Kg.k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f37480a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f37481b;

    public /* synthetic */ p(int i10, Object obj) {
        this.f37480a = i10;
        this.f37481b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Iterator, Kg.l, java.lang.Object, nf.e] */
    @Override // Kg.k
    public final Iterator iterator() {
        int i10 = this.f37480a;
        Object obj = this.f37481b;
        switch (i10) {
            case 0:
                return N.f0((Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return new C5918k(this);
            default:
                wf.n nVar = (wf.n) obj;
                AbstractC3557B.c0("block", nVar);
                ?? obj2 = new Object();
                obj2.f9840h0 = AbstractC5260f.n(obj2, obj2, nVar);
                return obj2;
        }
    }

    public p(BufferedReader bufferedReader) {
        this.f37480a = 2;
        this.f37481b = bufferedReader;
    }
}
