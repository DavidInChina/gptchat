package k5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p1.AbstractC5039d;
import p1.AbstractC5042g;
import u.C5820b;
import v.C5936e;

/* renamed from: k5.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4186l implements Parcelable {
    public static final Parcelable.Creator<C4186l> CREATOR = new Y2.n(20);

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f37076Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f37077Z;

    /* renamed from: h0  reason: collision with root package name */
    public final C4184j f37078h0;

    public C4186l(boolean z10, int i10, C4184j c4184j) {
        this.f37076Y = z10;
        this.f37077Z = i10;
        this.f37078h0 = c4184j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    public final String a(PackageManager packageManager) {
        String str;
        boolean z10;
        C4184j c4184j = this.f37078h0;
        c4184j.getClass();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
        if (resolveActivity != null) {
            str = resolveActivity.activityInfo.packageName;
        } else {
            str = null;
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 131072);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ?? r02 = c4184j.f37067Y;
        if (r02 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            if (!z10 || r02.contains(resolveInfo.activityInfo.packageName)) {
                Intent intent2 = new Intent();
                intent2.setAction("android.support.customtabs.action.CustomTabsService");
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    arrayList2.add(resolveInfo.activityInfo.packageName);
                } else {
                    arrayList.add(resolveInfo.activityInfo.packageName);
                }
            }
        }
        if (r02 == 0) {
            r02 = new ArrayList();
            if (str != null) {
                r02.add(str);
            }
            r02.addAll(C4184j.f37066Z);
        }
        String a5 = C4184j.a(str, arrayList2, r02);
        if (a5 == null) {
            return C4184j.a(str, arrayList, r02);
        }
        return a5;
    }

    public final C5936e c(Context context, Uri uri) {
        C5936e c5936e = new C5936e(uri);
        int i10 = this.f37077Z;
        if (i10 > 0) {
            U3.i iVar = new U3.i(2);
            Object obj = AbstractC5042g.f41723a;
            iVar.f17414Y = Integer.valueOf(AbstractC5039d.a(context, i10) | (-16777216));
            U3.n o10 = iVar.o();
            C5820b c5820b = c5936e.f46838b;
            c5820b.getClass();
            c5820b.f46322c = o10.m();
        }
        return c5936e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f37076Y ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f37077Z);
        parcel.writeParcelable(this.f37078h0, i10);
    }

    public C4186l(Parcel parcel) {
        this.f37076Y = parcel.readByte() != 0;
        this.f37077Z = parcel.readInt();
        this.f37078h0 = (C4184j) parcel.readParcelable(C4184j.class.getClassLoader());
    }
}
