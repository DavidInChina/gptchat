package com.auth0.android.jwt;

import I8.o;
import Y2.n;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.gson.reflect.TypeToken;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Map;
import k6.AbstractC4194d;

/* loaded from: classes2.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new n(18);

    /* renamed from: Y  reason: collision with root package name */
    public final String f26710Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Map f26711Z;

    /* renamed from: h0  reason: collision with root package name */
    public final f f26712h0;

    public d(String str) {
        String[] split = str.split("\\.");
        if (split.length == 2 && str.endsWith(Separators.DOT)) {
            split = new String[]{split[0], split[1], ""};
        }
        if (split.length == 3) {
            this.f26711Z = (Map) c(a(split[0]), new TypeToken().getType());
            this.f26712h0 = (f) c(a(split[1]), f.class);
            String str2 = split[2];
            this.f26710Y = str;
            return;
        }
        throw new RuntimeException(AbstractC4194d.v("The token was expected to have 3 parts, but got ", split.length, Separators.DOT));
    }

    public static String a(String str) {
        try {
            return new String(Base64.decode(str, 11), Charset.defaultCharset());
        } catch (IllegalArgumentException e10) {
            throw new RuntimeException("Received bytes didn't correspond to a valid Base64 encoded string.", e10);
        }
    }

    public static Object c(String str, Type type) {
        try {
            o oVar = new o();
            oVar.b(new e(0), f.class);
            return oVar.a().d(new StringReader(str), TypeToken.get(type));
        } catch (Exception e10) {
            throw new RuntimeException("The token's payload had an invalid JSON format.", e10);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f26710Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f26710Y);
    }
}
