package com.revenuecat.purchases.models;

import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.ProrationMode;
import id.AbstractC3557B;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0001\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\f\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00038\u0006\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0005R\u0014\u0010\u0012\u001a\u00020\u000f8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/models/GoogleProrationMode;", "", "Lcom/revenuecat/purchases/ProrationMode;", "", "describeContents", "()I", "Landroid/os/Parcel;", "out", "flags", "Ljf/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "playBillingClientMode", TokenNames.f24313I, "getPlayBillingClientMode", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "getAsGoogleReplacementMode$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "asGoogleReplacementMode", "<init>", "(Ljava/lang/String;II)V", "CREATOR", "IMMEDIATE_WITHOUT_PRORATION", "IMMEDIATE_WITH_TIME_PRORATION", "IMMEDIATE_AND_CHARGE_FULL_PRICE", "IMMEDIATE_AND_CHARGE_PRORATED_PRICE", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public enum GoogleProrationMode implements ProrationMode {
    IMMEDIATE_WITHOUT_PRORATION(3),
    IMMEDIATE_WITH_TIME_PRORATION(1),
    IMMEDIATE_AND_CHARGE_FULL_PRICE(5),
    IMMEDIATE_AND_CHARGE_PRORATED_PRICE(2);
    
    public static final CREATOR CREATOR = new CREATOR(null);
    private final int playBillingClientMode;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u001d\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/models/GoogleProrationMode$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/revenuecat/purchases/models/GoogleProrationMode;", "()V", "createFromParcel", "in", "Landroid/os/Parcel;", "fromPlayBillingClientMode", "playBillingClientMode", "", "(Ljava/lang/Integer;)Lcom/revenuecat/purchases/models/GoogleProrationMode;", "newArray", "", "size", "(I)[Lcom/revenuecat/purchases/models/GoogleProrationMode;", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class CREATOR implements Parcelable.Creator<GoogleProrationMode> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(g gVar) {
            this();
        }

        public final GoogleProrationMode fromPlayBillingClientMode(Integer num) {
            GoogleProrationMode[] values;
            if (num != null) {
                for (GoogleProrationMode googleProrationMode : GoogleProrationMode.values()) {
                    if (num.intValue() == googleProrationMode.getPlayBillingClientMode()) {
                        return googleProrationMode;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GoogleProrationMode createFromParcel(Parcel parcel) {
            AbstractC3557B.c0("in", parcel);
            String readString = parcel.readString();
            if (readString != null) {
                return GoogleProrationMode.valueOf(readString);
            }
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GoogleProrationMode[] newArray(int i10) {
            return new GoogleProrationMode[i10];
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GoogleProrationMode.values().length];
            try {
                iArr[GoogleProrationMode.IMMEDIATE_WITHOUT_PRORATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GoogleProrationMode.IMMEDIATE_WITH_TIME_PRORATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GoogleProrationMode.IMMEDIATE_AND_CHARGE_FULL_PRICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GoogleProrationMode.IMMEDIATE_AND_CHARGE_PRORATED_PRICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    GoogleProrationMode(int i10) {
        this.playBillingClientMode = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final GoogleReplacementMode getAsGoogleReplacementMode$purchases_customEntitlementComputationRelease() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return GoogleReplacementMode.CHARGE_PRORATED_PRICE;
                    }
                    throw new RuntimeException();
                }
                return GoogleReplacementMode.CHARGE_FULL_PRICE;
            }
            return GoogleReplacementMode.WITH_TIME_PRORATION;
        }
        return GoogleReplacementMode.WITHOUT_PRORATION;
    }

    @Override // com.revenuecat.purchases.ProrationMode
    public /* bridge */ /* synthetic */ String getName() {
        return name();
    }

    public final int getPlayBillingClientMode() {
        return this.playBillingClientMode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        AbstractC3557B.c0("out", parcel);
        parcel.writeString(name());
    }
}
