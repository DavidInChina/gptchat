package k4;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.gov.nist.core.Separators;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.webkit.MimeTypeMap;
import h4.q;
import id.AbstractC3557B;
import java.io.InputStream;
import java.util.List;
import kf.t;
import livekit.org.webrtc.MediaStreamTrack;
import nf.AbstractC4825e;
import q1.AbstractC5260f;
import r4.C5364a;

/* renamed from: k4.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4160b implements AbstractC4165g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f36999a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f37000b;

    /* renamed from: c  reason: collision with root package name */
    public final q4.n f37001c;

    public /* synthetic */ C4160b(Uri uri, q4.n nVar, int i10) {
        this.f36999a = i10;
        this.f37000b = uri;
        this.f37001c = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, r.f] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, r.f] */
    @Override // k4.AbstractC4165g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC4825e abstractC4825e) {
        List<String> pathSegments;
        int size;
        C5364a c5364a;
        Bundle bundle;
        AssetFileDescriptor openTypedAssetFile;
        C5364a c5364a2;
        int i10 = this.f36999a;
        Uri uri = this.f37000b;
        q4.n nVar = this.f37001c;
        switch (i10) {
            case 0:
                String m22 = t.m2(t.Z1(uri.getPathSegments(), 1), Separators.SLASH, null, null, null, 62);
                return new C4172n(new q(R4.b.J(R4.b.Z1(nVar.f43869a.getAssets().open(m22))), new Object()), u4.e.b(MimeTypeMap.getSingleton(), m22), h4.f.f31881h0);
            default:
                ContentResolver contentResolver = nVar.f43869a.getContentResolver();
                InputStream inputStream = null;
                if (AbstractC3557B.K(uri.getAuthority(), "com.android.contacts") && AbstractC3557B.K(uri.getLastPathSegment(), "display_photo")) {
                    AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    if (openAssetFileDescriptor != null) {
                        inputStream = openAssetFileDescriptor.createInputStream();
                    }
                    if (inputStream == null) {
                        throw new IllegalStateException(("Unable to find a contact photo associated with '" + uri + "'.").toString());
                    }
                } else if (Build.VERSION.SDK_INT >= 29 && AbstractC3557B.K(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && AbstractC3557B.K(pathSegments.get(size - 3), MediaStreamTrack.AUDIO_TRACK_KIND) && AbstractC3557B.K(pathSegments.get(size - 2), "albums")) {
                    r4.h hVar = nVar.f43872d;
                    AbstractC5260f abstractC5260f = hVar.f44441a;
                    if (abstractC5260f instanceof C5364a) {
                        c5364a = (C5364a) abstractC5260f;
                    } else {
                        c5364a = null;
                    }
                    if (c5364a != null) {
                        AbstractC5260f abstractC5260f2 = hVar.f44442b;
                        if (abstractC5260f2 instanceof C5364a) {
                            c5364a2 = (C5364a) abstractC5260f2;
                        } else {
                            c5364a2 = null;
                        }
                        if (c5364a2 != null) {
                            bundle = new Bundle(1);
                            bundle.putParcelable("android.content.extra.SIZE", new Point(c5364a.f44429h, c5364a2.f44429h));
                            openTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                            if (openTypedAssetFile != null) {
                                inputStream = openTypedAssetFile.createInputStream();
                            }
                            if (inputStream == null) {
                                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + uri + "'.").toString());
                            }
                        }
                    }
                    bundle = null;
                    openTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                    if (openTypedAssetFile != null) {
                    }
                    if (inputStream == null) {
                    }
                } else {
                    inputStream = contentResolver.openInputStream(uri);
                    if (inputStream == null) {
                        throw new IllegalStateException(("Unable to open '" + uri + "'.").toString());
                    }
                }
                return new C4172n(new q(R4.b.J(R4.b.Z1(inputStream)), new Object()), contentResolver.getType(uri), h4.f.f31881h0);
        }
    }
}
