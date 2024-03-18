package com.revenuecat.purchases;

import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.Parcel;
import android.os.Parcelable;
import id.AbstractC3557B;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&B%\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b#\u0010$B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\b#\u0010%J\u0010\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\b\u0007\u0010\bJ2\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u000e\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010\u0004R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b \u0010\u0004R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010\b\u00a8\u0006'"}, d2 = {"Lcom/revenuecat/purchases/PresentedOfferingContext;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/String;", "component2", "Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;", "component3", "()Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;", "offeringIdentifier", "placementIdentifier", "targetingContext", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;)Lcom/revenuecat/purchases/PresentedOfferingContext;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljf/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getOfferingIdentifier", "getPlacementIdentifier", "Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;", "getTargetingContext", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;)V", "(Ljava/lang/String;)V", "TargetingContext", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PresentedOfferingContext implements Parcelable {
    public static final Parcelable.Creator<PresentedOfferingContext> CREATOR = new Creator();
    private final String offeringIdentifier;
    private final String placementIdentifier;
    private final TargetingContext targetingContext;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<PresentedOfferingContext> {
        @Override // android.os.Parcelable.Creator
        public final PresentedOfferingContext createFromParcel(Parcel parcel) {
            AbstractC3557B.c0("parcel", parcel);
            return new PresentedOfferingContext(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TargetingContext.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PresentedOfferingContext[] newArray(int i10) {
            return new PresentedOfferingContext[i10];
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\b\f\u0010\u0007J\u0010\u0010\r\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\r\u0010\u0004J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u0013\u0010\u0004J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007\u00a8\u0006 "}, d2 = {"Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;", "Landroid/os/Parcelable;", "", "component1", "()I", "", "component2", "()Ljava/lang/String;", "revision", "ruleId", "copy", "(ILjava/lang/String;)Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljf/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", TokenNames.f24313I, "getRevision", "Ljava/lang/String;", "getRuleId", "<init>", "(ILjava/lang/String;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class TargetingContext implements Parcelable {
        public static final Parcelable.Creator<TargetingContext> CREATOR = new Creator();
        private final int revision;
        private final String ruleId;

        @Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<TargetingContext> {
            @Override // android.os.Parcelable.Creator
            public final TargetingContext createFromParcel(Parcel parcel) {
                AbstractC3557B.c0("parcel", parcel);
                return new TargetingContext(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TargetingContext[] newArray(int i10) {
                return new TargetingContext[i10];
            }
        }

        public TargetingContext(int i10, String str) {
            AbstractC3557B.c0("ruleId", str);
            this.revision = i10;
            this.ruleId = str;
        }

        public static /* synthetic */ TargetingContext copy$default(TargetingContext targetingContext, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = targetingContext.revision;
            }
            if ((i11 & 2) != 0) {
                str = targetingContext.ruleId;
            }
            return targetingContext.copy(i10, str);
        }

        public final int component1() {
            return this.revision;
        }

        public final String component2() {
            return this.ruleId;
        }

        public final TargetingContext copy(int i10, String str) {
            AbstractC3557B.c0("ruleId", str);
            return new TargetingContext(i10, str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TargetingContext)) {
                return false;
            }
            TargetingContext targetingContext = (TargetingContext) obj;
            return this.revision == targetingContext.revision && AbstractC3557B.K(this.ruleId, targetingContext.ruleId);
        }

        public final int getRevision() {
            return this.revision;
        }

        public final String getRuleId() {
            return this.ruleId;
        }

        public int hashCode() {
            return this.ruleId.hashCode() + (this.revision * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("TargetingContext(revision=");
            sb2.append(this.revision);
            sb2.append(", ruleId=");
            return android.gov.nist.core.a.n(sb2, this.ruleId, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            AbstractC3557B.c0("out", parcel);
            parcel.writeInt(this.revision);
            parcel.writeString(this.ruleId);
        }
    }

    public PresentedOfferingContext(String str, String str2, TargetingContext targetingContext) {
        AbstractC3557B.c0("offeringIdentifier", str);
        this.offeringIdentifier = str;
        this.placementIdentifier = str2;
        this.targetingContext = targetingContext;
    }

    public static /* synthetic */ PresentedOfferingContext copy$default(PresentedOfferingContext presentedOfferingContext, String str, String str2, TargetingContext targetingContext, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = presentedOfferingContext.offeringIdentifier;
        }
        if ((i10 & 2) != 0) {
            str2 = presentedOfferingContext.placementIdentifier;
        }
        if ((i10 & 4) != 0) {
            targetingContext = presentedOfferingContext.targetingContext;
        }
        return presentedOfferingContext.copy(str, str2, targetingContext);
    }

    public final String component1() {
        return this.offeringIdentifier;
    }

    public final String component2() {
        return this.placementIdentifier;
    }

    public final TargetingContext component3() {
        return this.targetingContext;
    }

    public final PresentedOfferingContext copy(String str, String str2, TargetingContext targetingContext) {
        AbstractC3557B.c0("offeringIdentifier", str);
        return new PresentedOfferingContext(str, str2, targetingContext);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresentedOfferingContext)) {
            return false;
        }
        PresentedOfferingContext presentedOfferingContext = (PresentedOfferingContext) obj;
        return AbstractC3557B.K(this.offeringIdentifier, presentedOfferingContext.offeringIdentifier) && AbstractC3557B.K(this.placementIdentifier, presentedOfferingContext.placementIdentifier) && AbstractC3557B.K(this.targetingContext, presentedOfferingContext.targetingContext);
    }

    public final String getOfferingIdentifier() {
        return this.offeringIdentifier;
    }

    public final String getPlacementIdentifier() {
        return this.placementIdentifier;
    }

    public final TargetingContext getTargetingContext() {
        return this.targetingContext;
    }

    public int hashCode() {
        int hashCode = this.offeringIdentifier.hashCode() * 31;
        String str = this.placementIdentifier;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        TargetingContext targetingContext = this.targetingContext;
        if (targetingContext != null) {
            i10 = targetingContext.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "PresentedOfferingContext(offeringIdentifier=" + this.offeringIdentifier + ", placementIdentifier=" + this.placementIdentifier + ", targetingContext=" + this.targetingContext + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        AbstractC3557B.c0("out", parcel);
        parcel.writeString(this.offeringIdentifier);
        parcel.writeString(this.placementIdentifier);
        TargetingContext targetingContext = this.targetingContext;
        if (targetingContext == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        targetingContext.writeToParcel(parcel, i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PresentedOfferingContext(String str) {
        this(str, null, null);
        AbstractC3557B.c0("offeringIdentifier", str);
    }
}
