package p1;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: p1.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5045j extends ContentProvider {

    /* renamed from: i0  reason: collision with root package name */
    public static final String[] f41726i0 = {"_display_name", "_size"};

    /* renamed from: j0  reason: collision with root package name */
    public static final File f41727j0 = new File(Separators.SLASH);

    /* renamed from: k0  reason: collision with root package name */
    public static final HashMap f41728k0 = new HashMap();

    /* renamed from: Y  reason: collision with root package name */
    public C5044i f41729Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f41730Z;

    /* renamed from: h0  reason: collision with root package name */
    public String f41731h0;

    public static C5044i b(int i10, Context context, String str) {
        C5044i c5044i;
        HashMap hashMap = f41728k0;
        synchronized (hashMap) {
            try {
                c5044i = (C5044i) hashMap.get(str);
                if (c5044i == null) {
                    try {
                        try {
                            c5044i = d(i10, context, str);
                            hashMap.put(str, c5044i);
                        } catch (IOException e10) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e10);
                        }
                    } catch (XmlPullParserException e11) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e11);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5044i;
    }

    public static Uri c(Application application, String str, File file) {
        String str2;
        C5044i b10 = b(0, application, str);
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : b10.f41725b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                String path2 = ((File) entry.getValue()).getPath();
                if (path2.endsWith(Separators.SLASH)) {
                    str2 = canonicalPath.substring(path2.length());
                } else {
                    str2 = canonicalPath.substring(path2.length() + 1);
                }
                return new Uri.Builder().scheme("content").authority(b10.f41724a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(str2, Separators.SLASH)).build();
            }
            throw new IllegalArgumentException(R.a.r("Failed to find configured root that contains ", canonicalPath));
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }

    public static C5044i d(int i10, Context context, String str) {
        C5044i c5044i = new C5044i(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (resolveContentProvider != null) {
            if (resolveContentProvider.metaData == null && i10 != 0) {
                Bundle bundle = new Bundle(1);
                resolveContentProvider.metaData = bundle;
                bundle.putInt("android.support.FILE_PROVIDER_PATHS", i10);
            }
            XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData == null) {
                throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            }
            while (true) {
                int next = loadXmlMetaData.next();
                if (next != 1) {
                    if (next == 2) {
                        String name = loadXmlMetaData.getName();
                        File file = null;
                        String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                        String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                        if ("root-path".equals(name)) {
                            file = f41727j0;
                        } else if ("files-path".equals(name)) {
                            file = context.getFilesDir();
                        } else if ("cache-path".equals(name)) {
                            file = context.getCacheDir();
                        } else if ("external-path".equals(name)) {
                            file = Environment.getExternalStorageDirectory();
                        } else if ("external-files-path".equals(name)) {
                            Object obj = AbstractC5042g.f41723a;
                            File[] b10 = AbstractC5037b.b(context, null);
                            if (b10.length > 0) {
                                file = b10[0];
                            }
                        } else if ("external-cache-path".equals(name)) {
                            Object obj2 = AbstractC5042g.f41723a;
                            File[] a5 = AbstractC5037b.a(context);
                            if (a5.length > 0) {
                                file = a5[0];
                            }
                        } else if ("external-media-path".equals(name)) {
                            File[] a10 = AbstractC5043h.a(context);
                            if (a10.length > 0) {
                                file = a10[0];
                            }
                        }
                        if (file == null) {
                            continue;
                        } else {
                            String str2 = new String[]{attributeValue2}[0];
                            if (str2 != null) {
                                file = new File(file, str2);
                            }
                            if (!TextUtils.isEmpty(attributeValue)) {
                                try {
                                    c5044i.f41725b.put(attributeValue, file.getCanonicalFile());
                                } catch (IOException e10) {
                                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e10);
                                }
                            } else {
                                throw new IllegalArgumentException("Name must not be empty");
                            }
                        }
                    }
                } else {
                    return c5044i;
                }
            }
        } else {
            throw new IllegalArgumentException(R.a.r("Couldn't find meta-data for provider with authority ", str));
        }
    }

    public final C5044i a() {
        C5044i c5044i;
        synchronized (this) {
            try {
                if (this.f41729Y == null) {
                    this.f41729Y = b(this.f41730Z, getContext(), this.f41731h0);
                }
                c5044i = this.f41729Y;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5044i;
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!providerInfo.exported) {
            if (providerInfo.grantUriPermissions) {
                this.f41731h0 = providerInfo.authority.split(Separators.SEMICOLON)[0];
                HashMap hashMap = f41728k0;
                synchronized (hashMap) {
                    hashMap.remove(this.f41731h0);
                }
                return;
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return a().a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File a5 = a().a(uri);
        int lastIndexOf = a5.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a5.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
            return "application/octet-stream";
        }
        return "application/octet-stream";
    }

    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        io.sentry.android.core.performance.b.c(this);
        io.sentry.android.core.performance.b.d(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i10;
        File a5 = a().a(uri);
        if ("r".equals(str)) {
            i10 = 268435456;
        } else if (!"w".equals(str) && !"wt".equals(str)) {
            if ("wa".equals(str)) {
                i10 = 704643072;
            } else if ("rw".equals(str)) {
                i10 = 939524096;
            } else if ("rwt".equals(str)) {
                i10 = 1006632960;
            } else {
                throw new IllegalArgumentException(R.a.r("Invalid mode: ", str));
            }
        } else {
            i10 = 738197504;
        }
        return ParcelFileDescriptor.open(a5, i10);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i10;
        String str3;
        File a5 = a().a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f41726i0;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i11 = 0;
        for (String str4 : strArr) {
            if ("_display_name".equals(str4)) {
                strArr3[i11] = "_display_name";
                i10 = i11 + 1;
                if (queryParameter == null) {
                    str3 = a5.getName();
                } else {
                    str3 = queryParameter;
                }
                objArr[i11] = str3;
            } else if ("_size".equals(str4)) {
                strArr3[i11] = "_size";
                i10 = i11 + 1;
                objArr[i11] = Long.valueOf(a5.length());
            }
            i11 = i10;
        }
        String[] strArr4 = new String[i11];
        System.arraycopy(strArr3, 0, strArr4, 0, i11);
        Object[] objArr2 = new Object[i11];
        System.arraycopy(objArr, 0, objArr2, 0, i11);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
