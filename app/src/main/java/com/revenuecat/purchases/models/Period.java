package com.revenuecat.purchases.models;

import android.gov.nist.core.a;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.common.LogUtilsKt;
import id.AbstractC3557B;
import jf.C3959i;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002./B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\b\u00a2\u0006\u0004\b,\u0010-J\u0010\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u00c6\u0003\u00a2\u0006\u0004\b\t\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\bH\u00c6\u0001\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bH\u00d6\u0001\u00a2\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u0011\u0010\u0004J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u0017\u0010\u0004J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0004R\u0017\u0010\f\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\u0007R\u0017\u0010\r\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010\nR\u0014\u0010'\u001a\u00020$8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010)\u001a\u00020$8F\u00a2\u0006\u0006\u001a\u0004\b(\u0010&R\u0014\u0010+\u001a\u00020$8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b*\u0010&\u00a8\u00060"}, d2 = {"Lcom/revenuecat/purchases/models/Period;", "Landroid/os/Parcelable;", "", "component1", "()I", "Lcom/revenuecat/purchases/models/Period$Unit;", "component2", "()Lcom/revenuecat/purchases/models/Period$Unit;", "", "component3", "()Ljava/lang/String;", "value", "unit", "iso8601", "copy", "(ILcom/revenuecat/purchases/models/Period$Unit;Ljava/lang/String;)Lcom/revenuecat/purchases/models/Period;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljf/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", TokenNames.f24313I, "getValue", "Lcom/revenuecat/purchases/models/Period$Unit;", "getUnit", "Ljava/lang/String;", "getIso8601", "", "getValueInWeeks$purchases_customEntitlementComputationRelease", "()D", "valueInWeeks", "getValueInMonths", "valueInMonths", "getValueInYears$purchases_customEntitlementComputationRelease", "valueInYears", "<init>", "(ILcom/revenuecat/purchases/models/Period$Unit;Ljava/lang/String;)V", "Factory", "Unit", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class Period implements Parcelable {
    private static final double DAYS_PER_MONTH = 30.0d;
    private static final double DAYS_PER_WEEK = 7.0d;
    private static final double DAYS_PER_YEAR = 365.0d;
    private static final double MONTHS_PER_YEAR = 12.0d;
    private static final double WEEKS_PER_MONTH = 4.345238095238096d;
    private static final double WEEKS_PER_YEAR = 52.142857142857146d;
    private final String iso8601;
    private final Unit unit;
    private final int value;
    public static final Factory Factory = new Factory(null);
    public static final Parcelable.Creator<Period> CREATOR = new Creator();

    @Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Period> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Period createFromParcel(Parcel parcel) {
            AbstractC3557B.c0("parcel", parcel);
            return new Period(parcel.readInt(), Unit.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Period[] newArray(int i10) {
            return new Period[i10];
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/models/Period$Factory;", "", "()V", "DAYS_PER_MONTH", "", "DAYS_PER_WEEK", "DAYS_PER_YEAR", "MONTHS_PER_YEAR", "WEEKS_PER_MONTH", "WEEKS_PER_YEAR", "create", "Lcom/revenuecat/purchases/models/Period;", "iso8601", "", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class Factory {
        private Factory() {
        }

        public /* synthetic */ Factory(g gVar) {
            this();
        }

        public final Period create(String str) {
            C3959i period;
            AbstractC3557B.c0("iso8601", str);
            period = PeriodKt.toPeriod(str);
            return new Period(((Number) period.f36155Y).intValue(), (Unit) period.f36156Z, str);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/models/Period$Unit;", "", "(Ljava/lang/String;I)V", "DAY", "WEEK", "MONTH", "YEAR", "UNKNOWN", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public enum Unit {
        DAY,
        WEEK,
        MONTH,
        YEAR,
        UNKNOWN
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Unit.values().length];
            try {
                iArr[Unit.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Unit.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Unit.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Unit.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Unit.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Period(int i10, Unit unit, String str) {
        AbstractC3557B.c0("unit", unit);
        AbstractC3557B.c0("iso8601", str);
        this.value = i10;
        this.unit = unit;
        this.iso8601 = str;
    }

    public static /* synthetic */ Period copy$default(Period period, int i10, Unit unit, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = period.value;
        }
        if ((i11 & 2) != 0) {
            unit = period.unit;
        }
        if ((i11 & 4) != 0) {
            str = period.iso8601;
        }
        return period.copy(i10, unit, str);
    }

    public final int component1() {
        return this.value;
    }

    public final Unit component2() {
        return this.unit;
    }

    public final String component3() {
        return this.iso8601;
    }

    public final Period copy(int i10, Unit unit, String str) {
        AbstractC3557B.c0("unit", unit);
        AbstractC3557B.c0("iso8601", str);
        return new Period(i10, unit, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Period)) {
            return false;
        }
        Period period = (Period) obj;
        return this.value == period.value && this.unit == period.unit && AbstractC3557B.K(this.iso8601, period.iso8601);
    }

    public final String getIso8601() {
        return this.iso8601;
    }

    public final Unit getUnit() {
        return this.unit;
    }

    public final int getValue() {
        return this.value;
    }

    public final double getValueInMonths() {
        double d10;
        double d11;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            LogUtilsKt.errorLog$default("Unknown period unit trying to get value in months: " + this.unit, null, 2, null);
                            return 0.0d;
                        }
                        throw new RuntimeException();
                    }
                    return this.value * MONTHS_PER_YEAR;
                }
                return this.value;
            }
            d10 = this.value;
            d11 = WEEKS_PER_MONTH;
        } else {
            d10 = this.value;
            d11 = DAYS_PER_MONTH;
        }
        return d10 / d11;
    }

    public final double getValueInWeeks$purchases_customEntitlementComputationRelease() {
        double d10;
        double d11;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            LogUtilsKt.errorLog$default("Unknown period unit trying to get value in months: " + this.unit, null, 2, null);
                            return 0.0d;
                        }
                        throw new RuntimeException();
                    }
                    d10 = this.value;
                    d11 = WEEKS_PER_YEAR;
                } else {
                    d10 = this.value;
                    d11 = WEEKS_PER_MONTH;
                }
                return d10 * d11;
            }
            return this.value;
        }
        return this.value / DAYS_PER_WEEK;
    }

    public final double getValueInYears$purchases_customEntitlementComputationRelease() {
        double d10;
        double d11;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            LogUtilsKt.errorLog$default("Unknown period unit trying to get value in months: " + this.unit, null, 2, null);
                            return 0.0d;
                        }
                        throw new RuntimeException();
                    }
                    return this.value;
                }
                d10 = this.value;
                d11 = MONTHS_PER_YEAR;
            } else {
                d10 = this.value;
                d11 = WEEKS_PER_YEAR;
            }
        } else {
            d10 = this.value;
            d11 = DAYS_PER_YEAR;
        }
        return d10 / d11;
    }

    public int hashCode() {
        int hashCode = this.unit.hashCode();
        return this.iso8601.hashCode() + ((hashCode + (this.value * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Period(value=");
        sb2.append(this.value);
        sb2.append(", unit=");
        sb2.append(this.unit);
        sb2.append(", iso8601=");
        return a.n(sb2, this.iso8601, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        AbstractC3557B.c0("out", parcel);
        parcel.writeInt(this.value);
        parcel.writeString(this.unit.name());
        parcel.writeString(this.iso8601);
    }
}
