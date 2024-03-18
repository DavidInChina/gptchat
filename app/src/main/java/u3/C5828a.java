package u3;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import r.ExecutorC5333a;
import s2.l;

/* renamed from: u3.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5828a {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f46344a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC5830c f46345b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f46346c;

    /* renamed from: d  reason: collision with root package name */
    public final File f46347d;

    /* renamed from: e  reason: collision with root package name */
    public final String f46348e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f46349f = false;

    /* renamed from: g  reason: collision with root package name */
    public C5829b[] f46350g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f46351h;

    public C5828a(AssetManager assetManager, ExecutorC5333a executorC5333a, AbstractC5830c abstractC5830c, String str, File file) {
        this.f46344a = executorC5333a;
        this.f46345b = abstractC5830c;
        this.f46348e = str;
        this.f46347d = file;
        int i10 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i10 >= 24 && i10 <= 34) {
            switch (i10) {
                case 24:
                case 25:
                    bArr = AbstractC5831d.f46368h;
                    break;
                case 26:
                    bArr = AbstractC5831d.f46367g;
                    break;
                case 27:
                    bArr = AbstractC5831d.f46366f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC5831d.f46365e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = AbstractC5831d.f46364d;
                    break;
            }
        }
        this.f46346c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f46345b.f();
            }
            return null;
        }
    }

    public final void b(int i10, Serializable serializable) {
        this.f46344a.execute(new l(this, i10, serializable, 3));
    }
}
