package com.google.android.material.datepicker;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class p implements Comparable, Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new w7.t(18);

    /* renamed from: Y  reason: collision with root package name */
    public final Calendar f27187Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f27188Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f27189h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f27190i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f27191j0;

    /* renamed from: k0  reason: collision with root package name */
    public final long f27192k0;

    /* renamed from: l0  reason: collision with root package name */
    public String f27193l0;

    public p(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b10 = w.b(calendar);
        this.f27187Y = b10;
        this.f27188Z = b10.get(2);
        this.f27189h0 = b10.get(1);
        this.f27190i0 = b10.getMaximum(7);
        this.f27191j0 = b10.getActualMaximum(5);
        this.f27192k0 = b10.getTimeInMillis();
    }

    public static p a(int i10, int i11) {
        Calendar d10 = w.d(null);
        d10.set(1, i10);
        d10.set(2, i11);
        return new p(d10);
    }

    public static p c(long j6) {
        Calendar d10 = w.d(null);
        d10.setTimeInMillis(j6);
        return new p(d10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f27187Y.compareTo(((p) obj).f27187Y);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f27188Z == pVar.f27188Z && this.f27189h0 == pVar.f27189h0) {
            return true;
        }
        return false;
    }

    public final String f() {
        String str;
        if (this.f27193l0 == null) {
            long timeInMillis = this.f27187Y.getTimeInMillis();
            if (Build.VERSION.SDK_INT >= 24) {
                str = w.a("yMMMM", Locale.getDefault()).format(new Date(timeInMillis));
            } else {
                str = DateUtils.formatDateTime(null, timeInMillis, 8228);
            }
            this.f27193l0 = str;
        }
        return this.f27193l0;
    }

    public final int g(p pVar) {
        if (this.f27187Y instanceof GregorianCalendar) {
            return (pVar.f27188Z - this.f27188Z) + ((pVar.f27189h0 - this.f27189h0) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f27188Z), Integer.valueOf(this.f27189h0)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f27189h0);
        parcel.writeInt(this.f27188Z);
    }
}
