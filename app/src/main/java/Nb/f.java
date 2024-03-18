package nb;

import Ad.l;
import Ng.F;
import android.app.Application;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import com.google.android.gms.internal.play_billing.N;
import com.openai.files.ChatFileProvider;
import id.AbstractC3557B;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import jf.y;
import kf.q;
import nf.AbstractC4825e;
import of.EnumC5000a;
import p1.AbstractC5045j;
import pf.AbstractC5163j;
import wd.s0;
import wd.u0;
import wf.k;
import wf.n;

/* loaded from: classes.dex */
public final class f extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ boolean f40179Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ g f40180Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f40181h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ k f40182i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, String str, AbstractC4825e abstractC4825e, k kVar, boolean z10) {
        super(2, abstractC4825e);
        this.f40179Y = z10;
        this.f40180Z = gVar;
        this.f40181h0 = str;
        this.f40182i0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new f(this.f40180Z, this.f40181h0, abstractC4825e, this.f40182i0, this.f40179Y);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Uri uri;
        String str;
        File file;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        try {
            int i10 = Build.VERSION.SDK_INT;
            k kVar = this.f40182i0;
            String str2 = this.f40181h0;
            g gVar = this.f40180Z;
            if (i10 < 29) {
                if (this.f40179Y) {
                    File[] externalMediaDirs = gVar.f40183a.getExternalMediaDirs();
                    AbstractC3557B.b0("getExternalMediaDirs(...)", externalMediaDirs);
                    file = (File) q.j3(externalMediaDirs);
                } else {
                    file = gVar.f40183a.getExternalCacheDir();
                }
                if (file == null) {
                    return new s0(0, new RuntimeException("No external directory"));
                }
                File file2 = new File(file, str2);
                io.sentry.instrumentation.file.e p10 = r.f.p(new FileOutputStream(file2), file2);
                kVar.invoke(p10);
                l.S(p10, null);
                MediaScannerConnection.scanFile(gVar.f40183a, new String[]{file2.getAbsolutePath()}, null, null);
                try {
                    Application application = gVar.f40183a;
                    int i11 = ChatFileProvider.f27707l0;
                    AbstractC3557B.c0("context", application);
                    String packageName = application.getPackageName();
                    uri = AbstractC5045j.c(application, packageName + ".files", file2);
                } catch (IllegalArgumentException e10) {
                    return new s0(0, e10);
                }
            } else {
                EnumC4806a[] enumC4806aArr = EnumC4806a.f40164Y;
                if (Lg.n.Z1(str2, "webp", false)) {
                    str = "image/webp";
                } else {
                    str = "image/jpg";
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", str2);
                contentValues.put("mime_type", str);
                contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
                contentValues.put("is_pending", new Integer(1));
                ContentResolver contentResolver = gVar.f40183a.getContentResolver();
                Uri insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                if (insert == null) {
                    return new s0(0, new RuntimeException("Failed to insert image"));
                }
                OutputStream openOutputStream = contentResolver.openOutputStream(insert);
                if (openOutputStream == null) {
                    return new s0(1, new RuntimeException("Failed to open output stream"));
                }
                kVar.invoke(openOutputStream);
                l.S(openOutputStream, null);
                contentValues.clear();
                contentValues.put("is_pending", new Integer(0));
                contentResolver.update(insert, contentValues, null, null);
                uri = insert;
            }
            return new u0(uri);
        } catch (IOException e11) {
            return new s0(1, e11);
        }
    }
}
