package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class U0 implements U {

    /* renamed from: a  reason: collision with root package name */
    public static final U0 f26882a = new Object();

    @Override // com.google.android.gms.internal.play_billing.U
    public final boolean a(int i10) {
        V0 v02;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        v02 = null;
                    } else {
                        v02 = V0.ALTERNATIVE_BILLING_ACTION;
                    }
                } else {
                    v02 = V0.LOCAL_PURCHASES_UPDATED_ACTION;
                }
            } else {
                v02 = V0.PURCHASES_UPDATED_ACTION;
            }
        } else {
            v02 = V0.BROADCAST_ACTION_UNSPECIFIED;
        }
        if (v02 != null) {
            return true;
        }
        return false;
    }
}
