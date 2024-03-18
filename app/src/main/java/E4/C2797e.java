package e4;

import d4.AbstractC2596e;
import d4.C2595d;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import jf.y;

/* renamed from: e4.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2797e {

    /* renamed from: f  reason: collision with root package name */
    public boolean f28957f;

    /* renamed from: h  reason: collision with root package name */
    public final C2797e f28959h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ C2801i f28960i;

    /* renamed from: a  reason: collision with root package name */
    public final long f28952a = Thread.currentThread().getId();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f28953b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f28954c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet f28955d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet f28956e = new LinkedHashSet();

    /* renamed from: g  reason: collision with root package name */
    public boolean f28958g = true;

    public C2797e(C2801i c2801i, C2797e c2797e) {
        this.f28960i = c2801i;
        this.f28959h = c2797e;
    }

    public final C2595d a() {
        boolean z10;
        if (this.f28952a == Thread.currentThread().getId()) {
            if (this.f28957f && this.f28958g) {
                z10 = true;
            } else {
                z10 = false;
            }
            C2797e c2797e = this.f28959h;
            C2801i c2801i = this.f28960i;
            if (c2797e == null) {
                if (z10) {
                    c2801i.j().U();
                    c2801i.j().j0();
                } else {
                    c2801i.j().j0();
                }
            }
            c2801i.f28968h0.set(c2797e);
            AbstractC2596e.f27992a.getClass();
            return new C2595d(y.f36177a);
        }
        throw new IllegalStateException("Transaction objects (`TransactionWithReturn` and `TransactionWithoutReturn`) must be used\nonly within the transaction lambda scope.".toString());
    }
}
