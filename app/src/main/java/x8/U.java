package x8;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class U extends com.google.android.gms.internal.play_billing.C {

    /* renamed from: Z  reason: collision with root package name */
    public boolean f49535Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f49536h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(Object obj) {
        super(1);
        this.f49536h0 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f49535Z;
    }

    @Override // com.google.android.gms.internal.play_billing.C, java.util.Iterator
    public final Object next() {
        if (!this.f49535Z) {
            this.f49535Z = true;
            return this.f49536h0;
        }
        throw new NoSuchElementException();
    }
}
