package com.revenuecat.purchases;

import android.os.Parcel;
import android.os.Parcelable;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\b\"\u0010#B\u001d\b\u0017\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0016\u00a2\u0006\u0004\b\"\u0010$J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u00d6\u0001\u00a2\u0006\u0004\b\u000f\u0010\u000eJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\fH\u00d6\u0001\u00a2\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00168\u0006\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00168\u0006\u00a2\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001a\u00a8\u0006%"}, d2 = {"Lcom/revenuecat/purchases/EntitlementInfos;", "Landroid/os/Parcelable;", "", "s", "Lcom/revenuecat/purchases/EntitlementInfo;", "get", "(Ljava/lang/String;)Lcom/revenuecat/purchases/EntitlementInfo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljf/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "all", "Ljava/util/Map;", "getAll", "()Ljava/util/Map;", "Lcom/revenuecat/purchases/VerificationResult;", "verification", "Lcom/revenuecat/purchases/VerificationResult;", "getVerification", "()Lcom/revenuecat/purchases/VerificationResult;", "active", "getActive", "<init>", "(Ljava/util/Map;Lcom/revenuecat/purchases/VerificationResult;)V", "(Ljava/util/Map;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class EntitlementInfos implements Parcelable {
    public static final Parcelable.Creator<EntitlementInfos> CREATOR = new Creator();
    private final Map<String, EntitlementInfo> active;
    private final Map<String, EntitlementInfo> all;
    private final VerificationResult verification;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<EntitlementInfos> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EntitlementInfos createFromParcel(Parcel parcel) {
            AbstractC3557B.c0("parcel", parcel);
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                linkedHashMap.put(parcel.readString(), EntitlementInfo.CREATOR.createFromParcel(parcel));
            }
            return new EntitlementInfos(linkedHashMap, VerificationResult.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EntitlementInfos[] newArray(int i10) {
            return new EntitlementInfos[i10];
        }
    }

    public EntitlementInfos(Map<String, EntitlementInfo> map, VerificationResult verificationResult) {
        AbstractC3557B.c0("all", map);
        AbstractC3557B.c0("verification", verificationResult);
        this.all = map;
        this.verification = verificationResult;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, EntitlementInfo> entry : map.entrySet()) {
            if (entry.getValue().isActive()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.active = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC3557B.K(EntitlementInfos.class, cls)) {
            return false;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type com.revenuecat.purchases.EntitlementInfos", obj);
        EntitlementInfos entitlementInfos = (EntitlementInfos) obj;
        if (AbstractC3557B.K(this.all, entitlementInfos.all) && AbstractC3557B.K(this.active, entitlementInfos.active) && this.verification == entitlementInfos.verification) {
            return true;
        }
        return false;
    }

    public final EntitlementInfo get(String str) {
        AbstractC3557B.c0("s", str);
        return this.all.get(str);
    }

    public final Map<String, EntitlementInfo> getActive() {
        return this.active;
    }

    public final Map<String, EntitlementInfo> getAll() {
        return this.all;
    }

    public final VerificationResult getVerification() {
        return this.verification;
    }

    public int hashCode() {
        return this.active.hashCode() + (this.all.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        AbstractC3557B.c0("out", parcel);
        Map<String, EntitlementInfo> map = this.all;
        parcel.writeInt(map.size());
        for (Map.Entry<String, EntitlementInfo> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, i10);
        }
        parcel.writeString(this.verification.name());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EntitlementInfos(Map<String, EntitlementInfo> map) {
        this(map, VerificationResult.NOT_REQUESTED);
        AbstractC3557B.c0("all", map);
    }
}
