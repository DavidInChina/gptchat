package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public enum V0 implements T {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f26888Y;

    V0(int i10) {
        this.f26888Y = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f26888Y);
    }
}
