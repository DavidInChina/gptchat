package w2;

import android.util.SparseArray;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import k6.AbstractC4194d;
import q.C5241w;
import s2.AbstractC5530A;
import s2.C5531a;

/* loaded from: classes.dex */
public final class n implements o {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f47706a = false;

    /* renamed from: b  reason: collision with root package name */
    public final Cipher f47707b = null;

    /* renamed from: c  reason: collision with root package name */
    public final SecretKeySpec f47708c = null;

    /* renamed from: d  reason: collision with root package name */
    public final SecureRandom f47709d = null;

    /* renamed from: e  reason: collision with root package name */
    public final U3.c f47710e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f47711f;

    /* renamed from: g  reason: collision with root package name */
    public r f47712g;

    public n(File file) {
        this.f47710e = new U3.c(file);
    }

    public static int h(l lVar, int i10) {
        int hashCode = lVar.f47697b.hashCode() + (lVar.f47696a * 31);
        if (i10 < 2) {
            long k10 = AbstractC4194d.k(lVar.f47700e);
            return (hashCode * 31) + ((int) (k10 ^ (k10 >>> 32)));
        }
        return (hashCode * 31) + lVar.f47700e.hashCode();
    }

    public static l i(int i10, DataInputStream dataInputStream) {
        p pVar;
        int readInt = dataInputStream.readInt();
        String readUTF = dataInputStream.readUTF();
        if (i10 < 2) {
            long readLong = dataInputStream.readLong();
            U3.l lVar = new U3.l(5, 0);
            lVar.h("exo_len", Long.valueOf(readLong));
            pVar = p.f47713c.a(lVar);
        } else {
            pVar = C5241w.a(dataInputStream);
        }
        return new l(readInt, readUTF, pVar);
    }

    @Override // w2.o
    public final void a(l lVar, boolean z10) {
        this.f47711f = true;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [w2.r, java.io.BufferedOutputStream] */
    @Override // w2.o
    public final void b(HashMap hashMap) {
        Throwable th2;
        Throwable e10;
        Cipher cipher = this.f47707b;
        U3.c cVar = this.f47710e;
        DataOutputStream dataOutputStream = null;
        try {
            C5531a G10 = cVar.G();
            r rVar = this.f47712g;
            if (rVar == null) {
                this.f47712g = new BufferedOutputStream(G10);
            } else {
                rVar.a(G10);
            }
            r rVar2 = this.f47712g;
            DataOutputStream dataOutputStream2 = new DataOutputStream(rVar2);
            try {
                dataOutputStream2.writeInt(2);
                boolean z10 = this.f47706a;
                dataOutputStream2.writeInt(z10 ? 1 : 0);
                if (z10) {
                    byte[] bArr = new byte[16];
                    SecureRandom secureRandom = this.f47709d;
                    int i10 = AbstractC5530A.f45131a;
                    secureRandom.nextBytes(bArr);
                    dataOutputStream2.write(bArr);
                    try {
                        cipher.init(1, this.f47708c, new IvParameterSpec(bArr));
                        dataOutputStream2.flush();
                        dataOutputStream2 = new DataOutputStream(new CipherOutputStream(rVar2, cipher));
                    } catch (InvalidAlgorithmParameterException e11) {
                        e10 = e11;
                        throw new IllegalStateException(e10);
                    } catch (InvalidKeyException e12) {
                        e10 = e12;
                        throw new IllegalStateException(e10);
                    }
                }
                dataOutputStream2.writeInt(hashMap.size());
                int i11 = 0;
                for (l lVar : hashMap.values()) {
                    dataOutputStream2.writeInt(lVar.f47696a);
                    dataOutputStream2.writeUTF(lVar.f47697b);
                    C5241w.b(lVar.f47700e, dataOutputStream2);
                    i11 += h(lVar, 2);
                }
                dataOutputStream2.writeInt(i11);
                dataOutputStream2.close();
                ((File) cVar.f17397h0).delete();
                int i12 = AbstractC5530A.f45131a;
                this.f47711f = false;
            } catch (Throwable th3) {
                th2 = th3;
                dataOutputStream = dataOutputStream2;
                AbstractC5530A.g(dataOutputStream);
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    @Override // w2.o
    public final boolean c() {
        U3.c cVar = this.f47710e;
        if (!((File) cVar.f17396Z).exists() && !((File) cVar.f17397h0).exists()) {
            return false;
        }
        return true;
    }

    @Override // w2.o
    public final void d(HashMap hashMap) {
        if (!this.f47711f) {
            return;
        }
        b(hashMap);
    }

    @Override // w2.o
    public final void delete() {
        U3.c cVar = this.f47710e;
        ((File) cVar.f17396Z).delete();
        ((File) cVar.f17397h0).delete();
    }

    @Override // w2.o
    public final void f(l lVar) {
        this.f47711f = true;
    }

    @Override // w2.o
    public final void g(HashMap hashMap, SparseArray sparseArray) {
        Throwable th2;
        Throwable e10;
        boolean z10 = true;
        Gi.e.n(!this.f47711f);
        U3.c cVar = this.f47710e;
        if (((File) cVar.f17396Z).exists() || ((File) cVar.f17397h0).exists()) {
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(cVar.A());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int readInt = dataInputStream2.readInt();
                    if (readInt >= 0 && readInt <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            Cipher cipher = this.f47707b;
                            if (cipher != null) {
                                byte[] bArr = new byte[16];
                                dataInputStream2.readFully(bArr);
                                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                                try {
                                    SecretKeySpec secretKeySpec = this.f47708c;
                                    int i10 = AbstractC5530A.f45131a;
                                    cipher.init(2, secretKeySpec, ivParameterSpec);
                                    dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, cipher));
                                } catch (InvalidAlgorithmParameterException e11) {
                                    e10 = e11;
                                    throw new IllegalStateException(e10);
                                } catch (InvalidKeyException e12) {
                                    e10 = e12;
                                    throw new IllegalStateException(e10);
                                }
                            }
                        } else if (this.f47706a) {
                            this.f47711f = true;
                        }
                        int readInt2 = dataInputStream2.readInt();
                        int i11 = 0;
                        for (int i12 = 0; i12 < readInt2; i12++) {
                            l i13 = i(readInt, dataInputStream2);
                            String str = i13.f47697b;
                            hashMap.put(str, i13);
                            sparseArray.put(i13.f47696a, str);
                            i11 += h(i13, readInt);
                        }
                        int readInt3 = dataInputStream2.readInt();
                        if (dataInputStream2.read() != -1) {
                            z10 = false;
                        }
                        if (readInt3 == i11 && z10) {
                            AbstractC5530A.g(dataInputStream2);
                            return;
                        }
                    }
                    AbstractC5530A.g(dataInputStream2);
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        AbstractC5530A.g(dataInputStream);
                    }
                    hashMap.clear();
                    sparseArray.clear();
                    ((File) cVar.f17396Z).delete();
                    ((File) cVar.f17397h0).delete();
                } catch (Throwable th3) {
                    th2 = th3;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        AbstractC5530A.g(dataInputStream);
                    }
                    throw th2;
                }
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                th2 = th4;
            }
            hashMap.clear();
            sparseArray.clear();
            ((File) cVar.f17396Z).delete();
            ((File) cVar.f17397h0).delete();
        }
    }

    @Override // w2.o
    public final void e(long j6) {
    }
}
