package z1;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import m.C4528h;
import nf.AbstractC4828h;
import q.r;
import v.C5934c;

/* renamed from: z1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6744c {

    /* renamed from: a  reason: collision with root package name */
    public static final C5934c f51439a = new C5934c(4);

    /* JADX WARN: Type inference failed for: r0v12, types: [m.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [m.h, java.lang.Object] */
    public static C4528h a(Context context, r rVar) {
        Cursor cursor;
        int i10;
        int i11;
        Uri withAppendedId;
        int i12;
        boolean z10;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) rVar.f43538c;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider != null) {
            String str2 = resolveContentProvider.packageName;
            String str3 = (String) rVar.f43539d;
            if (str2.equals(str3)) {
                Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                C5934c c5934c = f51439a;
                Collections.sort(arrayList, c5934c);
                List list = (List) rVar.f43541f;
                if (list == null) {
                    list = AbstractC4828h.e0(rVar.f43537b, resources);
                }
                int i13 = 0;
                loop1: while (true) {
                    cursor = null;
                    if (i13 < list.size()) {
                        ArrayList arrayList2 = new ArrayList((Collection) list.get(i13));
                        Collections.sort(arrayList2, c5934c);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                if (!Arrays.equals((byte[]) arrayList.get(i14), (byte[]) arrayList2.get(i14))) {
                                    break;
                                }
                            }
                            break loop1;
                        }
                        i13++;
                    } else {
                        resolveContentProvider = null;
                        break;
                    }
                }
                if (resolveContentProvider == null) {
                    ?? obj = new Object();
                    obj.f38769Y = 1;
                    obj.f38770Z = null;
                    return obj;
                }
                String str4 = resolveContentProvider.authority;
                ArrayList arrayList3 = new ArrayList();
                Uri build = new Uri.Builder().scheme("content").authority(str4).build();
                Uri build2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
                try {
                    cursor = AbstractC6743b.a(context.getContentResolver(), build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{(String) rVar.f43540e}, null, null);
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        arrayList3 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            if (columnIndex != -1) {
                                i10 = cursor.getInt(columnIndex);
                            } else {
                                i10 = 0;
                            }
                            if (columnIndex4 != -1) {
                                i11 = cursor.getInt(columnIndex4);
                            } else {
                                i11 = 0;
                            }
                            if (columnIndex3 == -1) {
                                withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                            } else {
                                withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                            }
                            Uri uri = withAppendedId;
                            if (columnIndex5 != -1) {
                                i12 = cursor.getInt(columnIndex5);
                            } else {
                                i12 = RCHTTPStatusCodes.BAD_REQUEST;
                            }
                            int i15 = i12;
                            if (columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            arrayList3.add(new C6749h(uri, i11, i15, z10, i10));
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    ?? obj2 = new Object();
                    obj2.f38769Y = 0;
                    obj2.f38770Z = (C6749h[]) arrayList3.toArray(new C6749h[0]);
                    return obj2;
                } catch (Throwable th2) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th2;
                }
            }
            throw new PackageManager.NameNotFoundException(android.gov.nist.core.a.k("Found content provider ", str, ", but package was not ", str3));
        }
        throw new PackageManager.NameNotFoundException(R.a.r("No package found for authority: ", str));
    }
}
