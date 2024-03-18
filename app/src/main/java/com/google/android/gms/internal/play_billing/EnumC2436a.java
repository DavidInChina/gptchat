package com.google.android.gms.internal.play_billing;

import N.C1025i;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.play_billing.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC2436a {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);
    

    /* renamed from: h0  reason: collision with root package name */
    public static final C2464o f26893h0;

    /* renamed from: Y  reason: collision with root package name */
    public final int f26895Y;

    static {
        EnumC2436a[] values;
        C1025i c1025i = new C1025i(8);
        for (EnumC2436a enumC2436a : values()) {
            Integer valueOf = Integer.valueOf(enumC2436a.f26895Y);
            int i10 = c1025i.f12350Z + 1;
            Object[] objArr = (Object[]) c1025i.f12351h0;
            int length = objArr.length;
            int i11 = i10 + i10;
            if (i11 > length) {
                int i12 = length + (length >> 1) + 1;
                if (i12 < i11) {
                    int highestOneBit = Integer.highestOneBit(i11 - 1);
                    i12 = highestOneBit + highestOneBit;
                }
                if (i12 < 0) {
                    i12 = Integer.MAX_VALUE;
                }
                c1025i.f12351h0 = Arrays.copyOf(objArr, i12);
            }
            Object[] objArr2 = (Object[]) c1025i.f12351h0;
            int i13 = c1025i.f12350Z;
            int i14 = i13 + i13;
            objArr2[i14] = valueOf;
            objArr2[i14 + 1] = enumC2436a;
            c1025i.f12350Z = i13 + 1;
        }
        C2448g c2448g = (C2448g) c1025i.f12352i0;
        if (c2448g == null) {
            C2464o a5 = C2464o.a(c1025i.f12350Z, (Object[]) c1025i.f12351h0, c1025i);
            C2448g c2448g2 = (C2448g) c1025i.f12352i0;
            if (c2448g2 == null) {
                f26893h0 = a5;
                return;
            }
            throw c2448g2.a();
        }
        throw c2448g.a();
    }

    EnumC2436a(int i10) {
        this.f26895Y = i10;
    }
}
